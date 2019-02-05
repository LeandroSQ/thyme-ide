java -jar "antlr-4.7.2-complete.jar" "Thyme.g4" -o "./generated/temp"
java -cp "antlr-4.7.2-complete.jar" "org.antlr.v4.gui.TestRig" "Thyme" "script" "example.thyme" -gui
cd "..\"
rmdir /s /q "d:\Projects\Javascript\Thyme\src\grammar\generated\temp\"