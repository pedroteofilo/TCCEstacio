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
public class ModelProdutoE {
    private int proId;
    private String proNome;
    private Double proPreco;
    private int quantidade;

    /**
     * @return the idProduto
     */
  
    /**
     * @param idProduto the idProduto to set
     */
   

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

    public void getProPreco(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getProId(){
         return proId;
    }
    
    public void setProId(int proId){
    this.proId=proId;
    }
    
    

    
    
}
