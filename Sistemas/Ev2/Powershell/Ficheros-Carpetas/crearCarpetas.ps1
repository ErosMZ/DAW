New-Item 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA' -ItemType Directory
New-Item 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\index.html' -ItemType File
New-Item 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\css' -ItemType Directory
New-Item 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\css\style.css' -ItemType FIle
New-Item 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\imgs' -ItemType Directory
Add-Content -Path 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\index.html' -Value '<!DOCTYPE html>'
Add-Content -Path 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\index.html' -Value '<html>'
Add-Content -Path 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\index.html' -Value '<head>'
Add-Content -Path 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\index.html' -Value '</head>'
Add-Content -Path 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\index.html' -Value '<body>'
Add-Content -Path 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\index.html' -Value '</body>'
Add-Content -Path 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\index.html' -Value '</html>'
Add-Content -Path 'C:\Users\Malaperra\Desktop\daw\sistemas\ps1\comprobación\EMPRESA\css\style.css' -Value 'body {}'

#Add-Content -Path .\*.txt -Exclude help* -Value 'End of file'