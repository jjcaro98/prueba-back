# prueba-back

Requerimientos:
Tener mysql instalado, y configurar los siguientes campos en el application.properties:

Al momento de crear la bd en mysql es necesario que la llamen pruebatc o en caso tal de 
llamarla de otra forma es necesario modificar el siguiente parametro
-spring.datasource.url=jdbc:mysql://localhost:3306/pruebatc?useunicode=true&usejdbccomplianttimezoneshift=true&uselegacydatetimecode=false&servertimezone=utc

donde dice pruebatc poner el nombre diferente dado el caso

Luego llenar los siguientes campos

-spring.datasource.username = "Aca va al usuario configurado por mysql"
-spring.datasource.password = "Clave asignada al usuario configurado"

El back fue desarrollado con springBoot en springToolSuite

Para ejecutar hay que darle en start
