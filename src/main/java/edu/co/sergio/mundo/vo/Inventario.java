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
public class Inventario {
    
    private int IDinventario;
    private int IDProducto;
    private int Cantidad;
    private double PrecioUnitario;
    private double PrecioTotal;

    public Inventario() {
    }

    public Inventario(int IDinventario, int IDProducto, int Cantidad, double PrecioUnitario, double PrecioTotal) {
        this.IDinventario = IDinventario;
        this.IDProducto = IDProducto;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.PrecioTotal = PrecioTotal;
    }

    public int getIDinventario() {
        return IDinventario;
    }

    public void setIDinventario(int IDinventario) {
        this.IDinventario = IDinventario;
    }

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }


}
