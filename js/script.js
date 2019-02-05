// Please ignore this mess
// On future versions i 'll do some refactoring on this file

var autoCompletion = [];

// ACE editor setup
var editor = ace.edit ("input_box");
editor.setTheme ("ace/theme/monokai");
editor.session.setMode ("ace/mode/thyme");
editor.setOptions ({ 
	enableBasicAutocompletion: false,
	enableSnippets: true,
	enableLiveAutocompletion: true,
	tabSize: 4,
	useSoftTabs: true
});
var languageTools = ace.require ("ace/ext/language_tools");
languageTools.addCompleter ({
	getCompletions: (editor, session, position, prefix, callback) => {
		if (prefix.length === 0) { callback (null, []); return; }
		callback (null, autoCompletion.map (function (word) {
			return { 
				name: word, 
				value: word, 
				score: 1, 
				meta: "global"
			};
		}));
		console.log (prefix);
	}
});

// Load file
var request = new XMLHttpRequest ();
request.open ("GET", "/grammar/debug.txt", true);
request.onload = () => {
	if (request.readyState == 4 && request.status == 200) {
		editor.getSession ().setValue (request.responseText);
	} else {
		console.error ("Some error ocurred !");
	}
};
request.send ();

var lastUpdateTime = 0;
var timeoutHandle = -1;
const UPDATE_TIME_THRESHOLD = 750;

function analyzeSourceCode () {
	// Get the text from Editor
	var textInput = editor.getSession ().getValue ();
	// Creates the Thyme engine and parses the source code
	var thymeEngine = new ThymeEngine ();
	thymeEngine.analyze (textInput);
	// Clears the annotations, and append the new ones
	editor.getSession ().clearAnnotations ();
	editor.getSession ().setAnnotations (thymeEngine.annotationList);
	// Changes the favicon of the page
	if (thymeEngine.annotationList.length <= 0) {
		document.querySelector ("link[rel='shortcut icon']").href = "img/favicon.png";
		document.querySelector ("link[rel*='icon']").href = "img/favicon.png";
	} else {
		document.querySelector ("link[rel='shortcut icon']").href = "img/favicon_error.png";
		document.querySelector ("link[rel*='icon']").href = "img/favicon_error.png";
	}

	autoCompletion = thymeEngine.engineContext.variables;
	// Notify as done
	timeoutHandle = -1;
}

editor.on ("change", (e) => {
	// Check if are waiting for a timeout to run
	if (timeoutHandle !== -1) { 
		lastUpdateTime = Date.now (); 
		return;
	}

	// If the time has passed
	if (Date.now () - lastUpdateTime >= UPDATE_TIME_THRESHOLD) {
		// Analyzes source code and notify as done
		analyzeSourceCode ();
		timeoutHandle = -1;
	} else {
		// Otherwise, schedulle it
		timeoutHandle = setTimeout (analyzeSourceCode, UPDATE_TIME_THRESHOLD);
	}

	lastUpdateTime = Date.now ();
});