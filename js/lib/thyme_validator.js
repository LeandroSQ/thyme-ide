editor.getSession ().setAnnotations ([{
	row: 0,
	column: 0,
	text: "Example",
	type: "error"
}])

function createAnnotation (inputText, charIndex, text, type) {
	
}

function validateCode (editor) {
	var session = editor.getSession ();
	var inputText = session.getValue ();

	// Do validations
	var annotationList = [];

	checksForSingleLineComments (inputText, annotationList);

	session.setAnnotations (annotationList);
}

function checksForSingleLineComments (inputText, annotationList) {
	const regex = /\/\/.*?$/gm;
	var match;

	// For every match of single line comment
	while (match = regex.exec (inputText)) {
		// Create an annotation
		var annotation = {
			row: 0,
			column: 0,
			text: "Example",
			type: "error"
		};

		// Appends to the annotationList
		annotationList.push (annotation);
	}
}