<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="deleteCliente.jsp" method="POST">

            <label>Código do Cliente: </label> <br>
            <input type="text" name="id" value="<%=request.getParameter("id")%>">      <br>

            <label>Nome do Cliente: </label> <br>
            <input type="text" name="nome" value="<%=request.getParameter("nome")%>">  <br>
            <button type="submit">Excluir</button>

        </form>

    </body>
</html>
