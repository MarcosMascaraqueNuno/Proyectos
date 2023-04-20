@echo off

REM Definimos la ruta donde queremos descargar el repositorio
set RUTA_DE_DESCARGA=C:\Users\Marcos\Documents\Proyectos

REM Clonamos el repositorio en la ruta de descarga
git clone https://github.com/MarcosMascaraqueNuno/Proyectos.git %RUTA_DE_DESCARGA%

REM Verificamos que el clonado se haya completado exitosamente
if %ERRORLEVEL% == 0 (
  echo Repositorio clonado exitosamente.
) else (
  echo Hubo un error al clonar el repositorio.
)

set origen=C:\Users\Marcos\Documents\Proyectos
set destino=C:\Users\Marcos\Documents\Programas

echo Reemplazando carpeta de %origen% a %destino%...

xcopy %origen% %destino% /s /e /h /i /y

echo La carpeta de Proyectos ha sido reemplazada por la carpeta de Programas.

echo Borrando carpeta %origen%...

if exist %origen% (
    rd /s /q %origen%
    echo Carpeta eliminada correctamente.
) else (
    echo La carpeta %origen% no existe.
)
pause