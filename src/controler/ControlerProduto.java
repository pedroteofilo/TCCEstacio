/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;
import DAO.DaoProdutos;
import java.util.ArrayList;
import java.util.List;
import model.ModelProduto;
/**
 *
 * @author Administrador
 */
public class ControlerProduto {
    private DaoProdutos daoProduto;

    /**
     * @return the daoProduto
     */
    public ArrayList<ModelProduto> geListaProdutoControler() {
        return (ArrayList<ModelProduto>) this.daoProduto.getProdutos();
    }
    
    
    
}
