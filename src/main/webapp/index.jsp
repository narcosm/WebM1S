<%-- 
    Document   : index
    Created on : 5/09/2022, 2:38:24 p. m.
    Author     : soporte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <meta name="author" content="Noe Arcos Muñoz">
        <meta name="description" content="Taller Web 2022">
        <meta name="keywords" content="java, jsp, web, mysql">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Taller Web 2022</title>
    </head>
    <body>
        <h1>Hola Mundo Web con Heroku y Maven</h1>
        <a href="UsuarioCTO">Aqui un servlet</a>
        <form action="UsuarioCTO" method="get">
            <label>NOMBRES: </label>
            <input type="text" name="nombres" required/>
            <label>APELLIDOS: </label>
            <input type="text" name="apellidos" required/>
            <input type="submit" name="registrar"  value="Registrar"/>
        </form>
        <p>Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas "Letraset", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.</p>
    </body>
</html>
