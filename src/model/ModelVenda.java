/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Administrador
 */
public class ModelVenda {

    public ModelVenda(int idVenda, int pkCliente, double valorLiquido, double valorBruto, double desonto, Date dataVenda) {
        this.idVenda = idVenda;
        this.pkCliente = pkCliente;
        this.valorLiquido = valorLiquido;
        this.valorBruto = valorBruto;
        this.desonto = desonto;
        this.dataVenda = dataVenda;
    }

    public ModelVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getPkCliente() {
        return pkCliente;
    }

    public void setPkCliente(int pkCliente) {
        this.pkCliente = pkCliente;
    }

    public double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getDesonto() {
        return desonto;
    }

    public void setDesonto(double desonto) {
        this.desonto = desonto;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
   private  int idVenda;
   private int pkCliente;
   private double valorLiquido;
   private double valorBruto;
   private double desonto;
   private Date  dataVenda;
    
    

 
    
}
