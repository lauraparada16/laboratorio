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
public class Factura {
    
    private int IDfactura;
    private String FechaFactura;
    private int IDProducto;
    private String NombreProducto;
    private int Cantidad;
    private double PrecioUnitario;
    private double PrecioTotal;
    private double Efectivo;
    private double Cambio;
    private String InfoSuper;
    private int IDcliente;
    private int IDvendedor;

    public Factura() {
    }

    public Factura(int IDfactura, String FechaFactura, int IDProducto, String NombreProducto, int Cantidad, double PrecioUnitario, double PrecioTotal, double Efectivo, double Cambio, String InfoSuper, int IDcliente, int IDvendedor) {
        this.IDfactura = IDfactura;
        this.FechaFactura = FechaFactura;
        this.IDProducto = IDProducto;
        this.NombreProducto = NombreProducto;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.PrecioTotal = PrecioTotal;
        this.Efectivo = Efectivo;
        this.Cambio = Cambio;
        this.InfoSuper = InfoSuper;
        this.IDcliente = IDcliente;
        this.IDvendedor = IDvendedor;
    }

    public int getIDfactura() {
        return IDfactura;
    }

    public void setIDfactura(int IDfactura) {
        this.IDfactura = IDfactura;
    }

    public String getFechaFactura() {
        return FechaFactura;
    }

    public void setFechaFactura(String FechaFactura) {
        this.FechaFactura = FechaFactura;
    }

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
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

    public double getEfectivo() {
        return Efectivo;
    }

    public void setEfectivo(double Efectivo) {
        this.Efectivo = Efectivo;
    }

    public double getCambio() {
        return Cambio;
    }

    public void setCambio(double Cambio) {
        this.Cambio = Cambio;
    }

    public String getInfoSuper() {
        return InfoSuper;
    }

    public void setInfoSuper(String InfoSuper) {
        this.InfoSuper = InfoSuper;
    }

    public int getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(int IDcliente) {
        this.IDcliente = IDcliente;
    }

    public int getIDvendedor() {
        return IDvendedor;
    }

    public void setIDvendedor(int IDvendedor) {
        this.IDvendedor = IDvendedor;
    }

    
}
