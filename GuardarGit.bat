@echo off

REM Navegamos al directorio de "Programas"
cd C:\Users\Marcos\Documents\Programas

REM Inicializamos el repositorio de Git
git init

REM Agregamos todos los archivos y carpetas al repositorio
git add .

REM Realizamos el commit con un mensaje descriptivo
git commit -m "Guardando todos los archivos y carpetas de Programas"

git push -u origin main

REM Avisamos al usuario que la operación ha sido completada
echo Todos los archivos y carpetas de Programas han sido guardados en Git

pause
