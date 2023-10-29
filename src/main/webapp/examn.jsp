<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page
        import="java.util.List" %>
<%@ page
        import="model.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario y Listado de TBL_PRODUCTOCL2</title>
    <style>
        /* Estilos CSS para mejorar la apariencia */
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ccc;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Formulario de Producto</h2>
        <form action="/LPII_EXAMEN_CRUZ_RODRIGUEZ/ProductoController" method="POST">
            <label for="nombrecl2">Nombre:</label>
            <input type="text" id="nombrecl2" name="nombrecl2" required>
            <br><br>
            <label for="precioventacl2">Precio de Venta:</label>
            <input type="number" id="precioventacl2" name="precioventacl2" step="0.01" required>
            <br><br>
            <label for="preciocompcl2">Precio de Compra:</label>
            <input type="number" id="preciocompcl2" name="preciocompcl2" step="0.01" required>
            <br><br>
            <label for="estadocl2">Estado:</label>
            <input type="text" id="estadocl2" name="estadocl2" required>
            <br><br>
            <label for="descripcl2">Descripción:</label>
            <textarea id="descripcl2" name="descripcl2" rows="4" required></textarea>
            <br><br>
            <input type="submit" value="Guardar Producto">
        </form>
        
        <h2>Listado de Productos</h2>
        <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Precio de Venta</th>
                <th>Precio de Compra</th>
                <th>Estado</th>
                <th>Descripción</th>
            </tr>
        </thead>
        <tbody>
        <% List<TblProductocl2> list =(List<TblProductocl2>) request.getAttribute("listar"); %>
        <% for(TblProductocl2 pro: list) { %>
        	<tr>
        		<td> <%=pro.getIdproductocl2() %> </td>
        		<td> <%=pro.getNombrecl2() %> </td>
        		<td> <%=pro.getPrecioventacl2() %> </td>
        		<td> <%=pro.getPreciocompcl2() %> </td>
        		<td> <%=pro.getEstadocl2() %> </td>
        		<td> <%=pro.getDescripcl2() %> </td>
        	</tr>
        	<% } %>
        </tbody>
            <!-- Aquí puedes agregar dinámicamente las filas de la tabla con datos de la base de datos -->
        </table>
    </div>
</body>
</html>
