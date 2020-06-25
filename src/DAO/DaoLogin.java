/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelUsuario;

/**
 *
 * @author Administrador
 */
public class DaoLogin {
    
    private final String LIST = "SELECT * FROM USUARIO";
     public List<ModelUsuario> getLogin() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<ModelUsuario> ListUser = new ArrayList<ModelUsuario>();
        try {
            conn = FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                 ModelUsuario usuario = new ModelUsuario();
                //produto.getIdProduto(rs.getInt("id"));
                usuario.setIdUsuario(rs.getInt("id_user"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getInt("senha"));
                ListUser.add(usuario);
            }
            FabricaConexao.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return  ListUser;
    } 
}
