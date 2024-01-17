
<%@page import="java.util.List"%>
<%@page import="com.mycompany.ejercicio1.models.Partido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votacion</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body>

        <h1>Votación</h1>
        <p>Elija su voto:</p>
        <form action="recuentoSv" method="POST">
            <div>
                <input type="radio" name="Votar" value="A"> Partido A
                <br>
                <input type="radio" name="Votar" value="B"> Partido B
                <br>
                <input type="radio" name="Votar" value="C"> Partido C
            </div>
            <br>
            <input type="submit" value="Votar" name="Votar" class="btn btn-primary">
        </form>

        <br>

        <form action="recuentoSv" method="GET">
            <Button type="submit" class="btn btn-success">Mostrar resultados</button>
        </form>



    </body>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</html>
