Clear-Host
$rutaCarpeta= "$HOME\Desktop\Documentos"
$rutaDes = "F:\BACKUP\"
$date = Get-Date -Format "yyyy-MM-dd"
$nomZip = $rutaCarpeta + $date + "-docs_inc.zip"

$ultimoDia = Get-ChildItem -Path $rutaCarpeta -Recurse | Where-Object {$_.LastWriteTime -gt (Get-Date).AddDate(-1)}
