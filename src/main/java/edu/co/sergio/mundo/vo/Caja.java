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
public class Caja {
    
    private int IDcaja;
    private int IDvendedor;

    public Caja() {
    }

    public Caja(int IDcaja, int IDvendedor) {
        this.IDcaja = IDcaja;
        this.IDvendedor = IDvendedor;
    }

    public int getIDcaja() {
        return IDcaja;
    }

    public void setIDcaja(int IDcaja) {
        this.IDcaja = IDcaja;
    }

    public int getIDvendedor() {
        return IDvendedor;
    }

    public void setIDvendedor(int IDvendedor) {
        this.IDvendedor = IDvendedor;
    }
    // Crear una lista de los precios totales
    
}
