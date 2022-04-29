package org.apache.jsp.Clientes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.DTO.ClientesDTO;
import java.util.ArrayList;
import br.com.DAO.ClientesDAO;

public final class selectClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Listar Clientes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            
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

        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
