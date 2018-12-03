/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;


/**
 *
 * @author Laura Parada
 */
public class Vendedor extends Persona{

    private int IDvendedor;

    public Vendedor() {
    }

    public Vendedor(int IDvendedor) {
        this.IDvendedor = IDvendedor;
    }

    public int getIDvendedor() {
        return IDvendedor;
    }

    public void setIDvendedor(int IDvendedor) {
        this.IDvendedor = IDvendedor;
    }
    
    
    
}
