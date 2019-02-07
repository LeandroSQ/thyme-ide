importScripts ("lib/require.js");
importScripts ("ThymeEngine.js");
var thymeEngine = new ThymeEngine ();

print = (msg) => {
	if (thymeEngine.debugMode) {
		console.info (msg);
	}
};

onmessage = (e) => {
	try {
		if (typeof e.data === "boolean") {		
			thymeEngine.debugMode = e.data;
			print ("[Worker] debug mode on");
			return;
		}

		print ("[Worker] input received!");
		var time = Date.now ();
		// Analyzes the source code	
		thymeEngine.analyze (e.data);
		// Calculate the spent time
		var spentTime = Date.now () - time;
		print ("[Worker] This parsing took " + spentTime + "ms");

		// Sends the results back to the UI thread
		postMessage ({
			hasErrors: thymeEngine.annotationList.length > 0,
			annotationList: thymeEngine.annotationList
		});
	} catch (exception) {
		console.error (exception);
	}
};