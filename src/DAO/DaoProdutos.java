/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.FabricaConexao;



/**
 *
 * @author Administrador
 */
   import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelProduto;
import model.ModelProdutoE;
public class DaoProdutos extends FabricaConexao  {
 
 
    private final String INSERT = "INSERT INTO PRODUTO ( NOME, PRECO) VALUES ('?',?)";
    private final String UPDATE = "UPDATE PRODUTO SET NOME=?, PRECO=? WHERE ID_PROD=?";
    private final String DELETE = "DELETE FROM PRODUTO WHERE ID_PROD =?";
    private final String LIST = "SELECT * FROM PRODUTO";
    private final String LISTBYID = "SELECT * FROM PRODUTO WHERE ID_PROD=?";
 
    public void inserir(ModelProdutoE produto) {
        if (produto != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
      PreparedStatement pstm; // ojeto que recebe e execula comandos em SQL
                String INSERT = "INSERT INTO PRODUTO ( NOME, PRECO) VALUES (?,?)";
                pstm = conn.prepareStatement(INSERT);
                pstm.setString(1, produto.getProNome());
                pstm.setDouble(2, produto.getProPreco());
                
                pstm.execute();
               
                 /* if (produto != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
      PreparedStatement pstm; // ojeto que recebe e execula comandos em SQL
                String INSERT = "INSERT INTO PRODUTO ( NOME, PRECO) VALUES (?,?)";
                pstm = conn.prepareStatement(INSERT);
                pstm.setString(1, produto.getProNome());
                pstm.setDouble(2, produto.getProPreco());
                
                pstm.execute();*/
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
                FabricaConexao.fechaConexao(conn, pstm);
 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir Produto no banco de"
                        + "dados " + e.getMessage());
            }
        } else {
            System.out.println("O Produto enviado por parâmetro está vazio");
        }
    }
    public boolean atualizar(ModelProdutoE produto) {
        boolean r = false;
        if (produto != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm;
                String UPDATE = "UPDATE PRODUTO SET NOME=?, PRECO=? WHERE ID_PROD=?";
                pstm = conn.prepareStatement(UPDATE);
 
                pstm.setString(1, produto.getProNome());
                pstm.setDouble(2, produto.getProPreco());
                pstm.setInt(3, produto.getProId());
 
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Contato alterado com sucesso");
                FabricaConexao.fechaConexao(conn);
                r = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar contato no banco de"
                        + "dados " + e.getMessage());
                
            }
        }else {
            JOptionPane.showMessageDialog(null, "O contato enviado por parâmetro está vazio");
        }
 
     return r;
    }
    public boolean remover(int id) {
        boolean r=false;
        Connection conn = null;
        try {
            conn = FabricaConexao.getConexao();
            PreparedStatement pstm;
            pstm = conn.prepareStatement(DELETE);
 
            pstm.setInt(1, id);
 
            pstm.execute();
            FabricaConexao.fechaConexao(conn, pstm);
         r=true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir contato do banco de"
                    + "dados " + e.getMessage());
        }
    return r;}
 
    public List<ModelProduto> getProdutos() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<ModelProduto> produtos = new ArrayList<ModelProduto>();
        try {
            conn = FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ModelProduto produto = new ModelProduto();
                //produto.getIdProduto(rs.getInt("id"));
                produto.setIdProduto(rs.getInt("id_prod"));
                produto.setProNome(rs.getString("nome"));
                produto.setProPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }
            FabricaConexao.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return produtos;
    }
 
    public ModelProduto getProdutoById(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ModelProduto produto = new ModelProduto();
        try {
            conn = FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                produto.setIdProduto(rs.getInt("id_prod"));
                produto.setProNome(rs.getString("nome"));
                produto.setProPreco(rs.getDouble("preco"));
                
            }
            FabricaConexao.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return produto;
    }
}
    
