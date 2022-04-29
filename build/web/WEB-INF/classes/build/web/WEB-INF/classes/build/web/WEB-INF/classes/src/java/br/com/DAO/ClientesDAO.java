package br.com.DAO;

import br.com.DTO.ClientesDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClientesDAO {
    
        Connection con;
        PreparedStatement pstm;
    
    public void CadastrarCliente(ClientesDTO objClientesDTO) throws ClassNotFoundException{
        
        String sql = "INSERT INTO clientes (nome_cliente, sexo, data_nasc, email, senha, telefone, cpf, cnh, categoria_cnh, endereco, bairro, cidade, UF) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        con = new  ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objClientesDTO.getNome_cliente());
            pstm.setString(2, objClientesDTO.getSexo());
            pstm.setString(3, objClientesDTO.getData_nasc());
            pstm.setString(4, objClientesDTO.getEmail());
            pstm.setString(5, objClientesDTO.getSenha());
            pstm.setString(6, objClientesDTO.getTelefone());
            pstm.setString(7, objClientesDTO.getCpf());
            pstm.setString(8, objClientesDTO.getCnh());
            pstm.setString(9, objClientesDTO.getCategoria_cnh());
            pstm.setString(10, objClientesDTO.getEndereco());
            pstm.setString(11, objClientesDTO.getBairro());
            pstm.setString(12, objClientesDTO.getCidade());
            pstm.setString(13, objClientesDTO.getUF());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cadastrar ClienteDAO" + erro);
        }
        
        
    }
    
}
