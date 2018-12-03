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
public class Producto {

    private int IDroducto;
    private String NombreProducto;
    private int Cantidad;
    private double Precio;
    private float CodeBarra;
    private String DATEentrada, DATEcadusidad;
    private String Proveedor;
    private double PrecioUnitario;
    private int Estado;// 0->No hay, 1-> Hay, -1->Esta en bodega
    private int IDfactura;

    public Producto() {
    }

    public Producto(int IDroducto, String NombreProducto, int Cantidad, double Precio, float CodeBarra, String DATEentrada, String DATEcadusidad, String Proveedor, double PrecioUnitario, int Estado, int IDfactura) {
        this.IDroducto = IDroducto;
        this.NombreProducto = NombreProducto;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.CodeBarra = CodeBarra;
        this.DATEentrada = DATEentrada;
        this.DATEcadusidad = DATEcadusidad;
        this.Proveedor = Proveedor;
        this.PrecioUnitario = PrecioUnitario;
        this.Estado = Estado;
        this.IDfactura = IDfactura;
    }

    public int getIDroducto() {
        return IDroducto;
    }

    public void setIDroducto(int IDroducto) {
        this.IDroducto = IDroducto;
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

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public float getCodeBarra() {
        return CodeBarra;
    }

    public void setCodeBarra(float CodeBarra) {
        this.CodeBarra = CodeBarra;
    }

    public String getDATEentrada() {
        return DATEentrada;
    }

    public void setDATEentrada(String DATEentrada) {
        this.DATEentrada = DATEentrada;
    }

    public String getDATEcadusidad() {
        return DATEcadusidad;
    }

    public void setDATEcadusidad(String DATEcadusidad) {
        this.DATEcadusidad = DATEcadusidad;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public int getIDfactura() {
        return IDfactura;
    }

    public void setIDfactura(int IDfactura) {
        this.IDfactura = IDfactura;
    }



}
