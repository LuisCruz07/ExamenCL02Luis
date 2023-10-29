<!DOCTYPE html>
<html>
<head>
    <title>Iniciar Sesi�n</title>
    <style>
        /* Estilos CSS para mejorar la apariencia */
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            max-width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        label {
            display: block;
            margin-bottom: 10px;
        }
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
        }
        input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Iniciar Sesi�n</h2>
        <form action="/LPII_EXAMEN_CRUZ_RODRIGUEZ/UsuarioController" method="POST">
            <label for="usuario">Usuario:</label>
            <input type="text" id="usuario" name="usuario" required>
            <label for="contrasena">Contrase�a:</label>
            <input type="password" id="contrasena" name="contrasena" required>
            <input type="submit" value="Iniciar Sesi�n">
        </form>
    </div>
</body>
</html>
