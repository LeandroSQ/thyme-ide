import os
import subprocess
import shutil

# This script does the build, replacement and copying of the antlr generated files

buildCommand = 'java -jar "antlr-4.7.2-complete.jar" -Dlanguage=JavaScript "Thyme.g4" -o "./generated" -visitor';

def normalizePath (path):
	return path.replace ("\\", os.sep)

def executeComand (command):
	try:
		# Create a new process
		processResult = subprocess.run (command, shell=True, check=True, universal_newlines=True)

		print (processResult.args)
		if processResult.returncode == 0:
			return "OK"
		elif processResult.returncode == 1:
			return "Process failed\n" + processResult.stderr
	except subprocess.CalledProcessError as e:
		if e.output != None:
			return "Process failed\n" + e.output
		else:
			 return "Process failed"

def replaceAntlrPath (src):
	replaceSource = "antlr4/index";
	replaceTarget = "lib/antlr4/index";

	for item in os.listdir (src):
		path = os.path.join (src, item);
		# Check if is File
		if not os.path.isdir (path):
			# Extract file extension
			fileExtension = path.split (".")[-1];

			# Only do refactor in javascript files
			if fileExtension == "js":				
				print ("Processing file '" + item + "'");
				# Opens file
				file = open (path, "r+");
				# Read file's content and refactor packages
				fileText = file.read ();
				file.seek (0);
				fileText = fileText.replace (replaceSource, replaceTarget);
				# Write new text to file
				file.write (fileText);

				# Close file
				file.truncate ()
				file.close();
				
				print ("Copying file '" + item + "'...");
				shutil.copy2 (path, normalizePath ("../"));

# Build files
print ("Building antlr files...");
result = executeComand (buildCommand);
if result == "OK":
	print ("\nCopying generated files...");
	# Replace files path
	replaceAntlrPath (os.path.join (os.getcwd (), "generated"));
	print ("Done");
else:
	print ("Some error ocurred!");
	print (result);

