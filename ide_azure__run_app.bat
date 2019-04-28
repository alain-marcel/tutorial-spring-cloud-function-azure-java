cd target\azure-functions\tutorial-spring-cloud-function-azure-java


REM Start with PowerShell
REM start powershell.exe -noexit -command "func host start --language-worker -- ""-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005"""

REM Start with DOS CMD
func host start --language-worker -- "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005"
