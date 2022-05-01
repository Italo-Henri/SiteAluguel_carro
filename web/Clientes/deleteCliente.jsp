<%@page import="br.com.DAO.ClientesDAO"%>
<%@page import="br.com.DTO.ClientesDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%

            try {

                ClientesDTO objClientesDTO = new ClientesDTO();
                objClientesDTO.setId_usuario(Integer.parseInt(request.getParameter("id")));

                ClientesDAO objClientesDAO = new ClientesDAO();
                objClientesDAO.ExcluirCliente(objClientesDTO);

            } catch (Exception erro) {
                System.out.println("Erro ao excluir o cadastro: " + erro);
            }

        %>

    </body>
</html>
