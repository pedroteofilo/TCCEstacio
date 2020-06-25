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
public class ModelProduto {
    private int idProduto;
    private String proNome;
    private Double proPreco;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the proNome
     */
    public String getProNome() {
        return proNome;
    }

    /**
     * @param proNome the proNome to set
     */
    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    /**
     * @return the proPreco
     */
    public Double getProPreco() {
        return proPreco;
    }

    /**
     * @param proPreco the proPreco to set
     */
    public void setProPreco(Double proPreco) {
        this.proPreco = proPreco;
    }

   
    
    
    
}
