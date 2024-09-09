Hola, con la configuración realizada en el docker-compose.yml para imgresar a la interface gráfica de rabbitmq debes hacerlo a través de:
http://localhost:15672
En mi caso tengo  configurado el user: rgvwebs y el password: admin
Puedes cambiar estos usuario y contraseña en el mismo docker-compose.yml

Para validar que el servicio este trabajando de forma correcta utilice postman, puedes usar tu herramienta favorita utilizando el método post en la url;
http://localhost:8080/publish/shape 
Con el Json
{
    "name":"square",
    "numberOfSides":4
}

http://localhost:8080/publish/color
Con el Json
{
    "name":"White",
    "hexColor":"#FFFFFF"
}
Así podrás verificar en la consola de log en ambos proyectos la información tanto de publisher como deel consumer.
Saludos.
