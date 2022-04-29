<%@page import="br.com.DTO.ClientesDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.DAO.ClientesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Clientes</title>
    </head>
    <body>
        
        <%
            
            try {
                    
                ClientesDAO objClientesDAO = new ClientesDAO();
                ArrayList<ClientesDTO> Lista = objClientesDAO.ListarClientes();
                
                for(int num = 0; num < Lista.size() ; num ++){
                    
                    out.print("Código: " + Lista.get(num).getId_usuario() + "<br>");
                    out.print("Nome: " + Lista.get(num).getNome_cliente() + "<br>");
                    out.print("Gênero: " + Lista.get(num).getSexo() + "<br>");
                    out.print("Data Nascimento: " + Lista.get(num).getData_nasc() + "<br>");
                    out.print("Email: " + Lista.get(num).getEmail() + "<br>");
                    out.print("Senha: " + Lista.get(num).getSenha() + "<br>");
                    out.print("Telefone: " + Lista.get(num).getTelefone() + "<br>");
                    out.print("CPF: " + Lista.get(num).getCpf() + "<br>");
                    out.print("CNH: " + Lista.get(num).getCnh() + "<br>");
                    out.print("Categoria da CNH: " + Lista.get(num).getCategoria_cnh() + "<br>");
                    out.print("Endereço: " + Lista.get(num).getEndereco() + "<br>");
                    out.print("Bairro: " + Lista.get(num).getBairro() + "<br>");
                    out.print("Cidade: " + Lista.get(num).getCidade() + "<br>");
                    out.print("UF: " + Lista.get(num).getUF() + "<br>"
                    + "<br>");
                    
                }
                
                } catch (Exception erro) {
                    System.out.println("Não foi possível Listar os Clientes: " + erro);
                }

        %>
        
    </body>
</html>
