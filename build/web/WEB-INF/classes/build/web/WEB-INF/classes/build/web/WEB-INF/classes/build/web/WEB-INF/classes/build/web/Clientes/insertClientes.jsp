<%@page import="br.com.DAO.ClientesDAO"%>
<%@page import="br.com.DTO.ClientesDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Cliente</title>
    </head>
    <body>

        <%

            try {
                
                ClientesDTO objClientesDTO = new ClientesDTO();
                objClientesDTO.setNome_cliente(request.getParameter("nome"));

                ClientesDAO objClientesDAO = new ClientesDAO();
                objClientesDAO.CadastrarCliente(objClientesDTO);
                
            } catch (Exception erro) {
                System.out.println("Erro ao executar o cadastro: " + erro);
            }

        %>

    </body>
</html>
