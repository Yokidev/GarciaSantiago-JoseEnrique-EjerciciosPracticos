<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Torneo Baloncesto</h1>


        <div>
            <h2>Añadir Equipo</h2>

            <form action="" method="POST">

                <label for="nombre">Nombre</label>
                <input type="text" name="nombre">

                <button type="submit">Agregar equipo</button>
            </form>
        </div>

        <div>
            <h2>Añadir Partido</h2>

            <form action="" method="POST">

                <label for="equipoLocal">Local</label>
                <input type="text" name="equipoLocal">
                <input type="number" name="resultadoLocal">
                <label for="equipoVisitante">Visitante</label>
                <input type="text" name="equipoVisitante">
                <input type="number" name="resultadoVisitante">
                <input type="date" name="fecha">
                <button type="submit">Agregar partido</button>
            </form>
        </div>

        <div>
            <form action="" method="GET">
                <button type="submit">Mostrar Equipos</button>
            </form>
        </div>
        <div>
            <form action="" method="GET">
                <button type="submit">Mostrar Partidos</button>
            </form>
        </div>

    </body>
</html>
