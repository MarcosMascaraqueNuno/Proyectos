@echo off

:menu
cls
echo Seleccione una opción:
echo 1. Guardar archivos y carpetas de Programas en Git.
echo 2. Clonar el repositorio y reemplazar la carpeta de Proyectos por la de Programas y borrar la carpeta de Proyectos.
echo 3. Salir.
set /p opcion=

if %opcion%==1 (
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
  goto menu
)

if %opcion%==2 (

  REM Clonamos el repositorio en la ruta de descarga
  git clone https://github.com/MarcosMascaraqueNuno/Proyectos.git C:\Users\Marcos\Documents\Proyectos

  REM Verificamos que el clonado se haya completado exitosamente
  if %ERRORLEVEL% == 0 (
    echo Repositorio clonado exitosamente.
  ) else (
    echo Hubo un error al clonar el repositorio.
  )
  echo Reemplazando carpeta de C:\Users\Marcos\Documents\Proyectos a C:\Users\Marcos\Documents\Programas...

  xcopy C:\Users\Marcos\Documents\Proyectos C:\Users\Marcos\Documents\Programas /s /e /h /i /y

  echo La carpeta de Proyectos ha sido reemplazada por la carpeta de Programas.

  echo Borrando carpeta C:\Users\Marcos\Documents\Proyectos...

  if exist C:\Users\Marcos\Documents\Proyectos (
      rd /s /q C:\Users\Marcos\Documents\Proyectos
      echo Carpeta eliminada correctamente.
  ) else (
      echo La carpeta %origen% no existe.
  )
  

  pause
  goto menu
)

if %opcion%==3 (
  exit
)

goto menu
