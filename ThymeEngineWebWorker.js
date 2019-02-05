importScripts ("js/lib/require.js");
importScripts ("js/ThymeEngine.js");

onmessage = (e) => {
	// Analyzes the source code
	var thymeEngine = new ThymeEngine ();
	thymeEngine.analyze (e.data);

	// Sends the results back to the UI thread
	postMessage ({
		hasErrors: thymeEngine.annotationList.length > 0,
		annotationList: thymeEngine.annotationList
	});
};