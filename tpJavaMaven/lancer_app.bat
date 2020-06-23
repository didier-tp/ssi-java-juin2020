REM open with / text editor pour saisir sous eclipse
REM open with / system editor  pour lancer depuis eclipse
cd /d "%~dp0"
java -classpath target/tpJavaMaven-jar-with-dependencies.jar -DmonAppli.Debug=true tp.CarreApp 5
pause