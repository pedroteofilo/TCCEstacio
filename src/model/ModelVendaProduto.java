/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrador
 */
public class ModelVendaProduto {
    
    private int idVendaProduto;
    private int produto;
    private int venda;
    private double vendaProValor;
    private int quantidade;

    /**
     * @return the idVendaProduto
     */
    public int getIdVendaProduto() {
        return idVendaProduto;
    }

    /**
     * @param idVendaProduto the idVendaProduto to set
     */
    public void setIdVendaProduto(int idVendaProduto) {
        this.idVendaProduto = idVendaProduto;
    }

    /**
     * @return the produto
     */
    public int getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(int produto) {
        this.produto = produto;
    }

    /**
     * @return the venda
     */
    public int getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(int venda) {
        this.venda = venda;
    }

    /**
     * @return the vendaProValor
     */
    public double getVendaProValor() {
        return vendaProValor;
    }

    /**
     * @param vendaProValor the vendaProValor to set
     */
    public void setVendaProValor(double vendaProValor) {
        this.vendaProValor = vendaProValor;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
