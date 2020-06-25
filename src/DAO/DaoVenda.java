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
import model.ModelProduto;
import model.ModelProdutoE;
import conexoes.FabricaConexao;
import model.ModelVenda;
/**
 *
 * @author Administrador
 */
public class DaoVenda extends FabricaConexao {
    
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
*/
                    
 
 
    private final String INSERT = "INSERT INTO VENDAS ( PK_CLIENTE, VALOR_LIQUIDO, VALOR_BRUTO"
            + "DATA_VENDA, DESCONTO) VALUES (?,?,?,?,?)";
    private final String UPDATE = "UPDATE VENDAS SET PK_CLIENTE=?, VALOR_LIQUIDO=?, VALOR_BRUTO=?"
            + "DATA_VENDA=?, DESCONTO=? WHERE ID_PROD=?";
    private final String DELETE = "DELETE FROM VENDAS WHERE ID_PROD =?";
    private final String LIST = "SELECT * FROM VENDAS";
    private final String LISTBYID = "SELECT * FROM VENDAS WHERE ID_PROD=?";
 
    public void salvarVenda (ModelVenda vendas) {
        if (vendas != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
      PreparedStatement pstm; // ojeto que recebe e execula comandos em SQL
                String INSERT = "INSERT INTO VENDAS ( PK_CLIENTE, VALOR_LIQUIDO, VALOR_BRUTO"
            + "DATA_VENDA, DESCONTO) VALUES (?,?,?,?,?)";
                pstm = conn.prepareStatement(INSERT);
                pstm.setInt(1, vendas.getPkCliente());
                pstm.setDouble(2, vendas.getValorLiquido());
                pstm.setDouble(3, vendas.getValorBruto());
                pstm.setDouble(4, vendas.getDesonto());
                //pstm.setData(2, vendas.getDataVenda());
                
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
    public void atualizar(ModelProdutoE produto) {
        if (produto != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm;
                String UPDATE = "UPDATE VENDAS SET PK_CLIENTE=?, VALOR_LIQUIDO=?, VALOR_BRUTO=?"
            + "DATA_VENDA=?, DESCONTO=? WHERE ID_PROD=?";
                pstm = conn.prepareStatement(UPDATE);
 
                pstm.setString(1, produto.getProNome());
                pstm.setDouble(2, produto.getProPreco());
                pstm.setInt(3, produto.getProId());
 
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Contato alterado com sucesso");
                FabricaConexao.fechaConexao(conn);
 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar contato no banco de"
                        + "dados " + e.getMessage());
            }
        }else {
            JOptionPane.showMessageDialog(null, "O contato enviado por parâmetro está vazio");
        }
 
 
    }
    public void remover(int id) {
        Connection conn = null;
        try {
            conn = FabricaConexao.getConexao();
            PreparedStatement pstm;
            pstm = conn.prepareStatement(DELETE);
 
            pstm.setInt(1, id);
 
            pstm.execute();
            FabricaConexao.fechaConexao(conn, pstm);
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir contato do banco de"
                    + "dados " + e.getMessage());
        }
    }
 
    public List<ModelVenda> getVendas() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<ModelVenda> vendasg = new ArrayList<ModelVenda>();
        try {
            conn = FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                 ModelVenda vendas = new ModelVenda();
                //produto.getIdProduto(rs.getInt("id"));
            vendas.setIdVenda(rs.getInt("id_pro"));
                vendas.setPkCliente(rs.getInt("pk_cliente"));
                vendas.setValorLiquido(rs.getDouble("valor_liquido"));
                vendas.setValorBruto(rs.getDouble("valor_bruto"));
               // vendas.setDataVenda(rs.getData("data_venda"));
               vendas.setDesonto(rs.getDouble("descoto"));;
                vendasg.add(vendas);
            }
            FabricaConexao.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return vendasg;
    }
 
    public ModelVenda getProdutoById(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ModelVenda vendas = new ModelVenda();
        try {
            conn = FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                vendas.setIdVenda(rs.getInt("id_pro"));
                vendas.setPkCliente(rs.getInt("pk_cliente"));
                vendas.setValorLiquido(rs.getDouble("valor_liquido"));
                vendas.setValorBruto(rs.getDouble("valor_bruto"));
               // vendas.setDataVenda(rs.getData("data_venda"));
               vendas.setDesonto(rs.getDouble("descoto"));
                
            }
            FabricaConexao.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return vendas;
    }
}
    

    

