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
public  class Persona {
    
    private int ID;
    private String Nombre;
    private int Telefono;
    private String Correo;

    public Persona() {
    }

    public Persona(int ID, String Nombre, int Telefono, String Correo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    


}
