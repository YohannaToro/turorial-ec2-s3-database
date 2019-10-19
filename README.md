## turorial-ec2-s3-database

### Requisitos 
*   Java 1.8
*   Maven 3.6.0
*   SSH Y SFTP
*   Cuenta en AWS o AWS-EDUCATE

### Tutorial de cómo construir

* Desplegar un formulario dinámico usando EC2
1. Seleccione launch instance para crear una nueva instancia
2. Amazon Linux AMI 2018.03.0 (HVM), SSD Volume Type - ami-00eb20669e0990cb4
3. next configure instance details
4. Desde el step 3 al step 5 se deja la configuracion por defecto
5. En el step 6 se agrega una nueva regla TCP donde define el puerto  y en pone anywhere en ambas reglas
6. Continua y crea una nueva clave o elige una existente si tiene una
7. Finalmente se da click en lunch y se crea una instancia
## para mas detalles ver el siguiente video:
https://www.youtube.com/watch?v=XOLvGp3cJ_o&feature=youtu.be

*  Desplegar un sitio estático usando S3
1. Da click en create new bucket
2. en el segundo paso dejamos la colonfiguracion por defecto
3. Dejamos que tenga acceso publico
4. Click en update para cargar un archivo
5. click en la imagen y seleccionamos overview
## para mas detalles ver el siguiente video:
https://youtu.be/jNFKeygpt_A


*   Creacion de base de datos relacional 
1. Da click en create database
2. elige la opcion Mysql
3. Seleccuiona la opcion gratuita
4. En setting define el usuario y la clve que tendra la base de datos
5. en la secciuon connetivity da click en la opcion additional connectivity y da click en yes para permitir el acceso publico
6. Da click en additional configuration para definir el nombre de la base de datos
7. Finalmente le da cliick en create database

## para mas detalles ver el siguiente video:
https://youtu.be/S5L9odCgJBY

