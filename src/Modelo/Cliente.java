/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author UNICESAR-401
 */
public class Cliente {
    
    private String nombre,apellido;
    private long ID;
    
    public Cliente(String nombre, String apellido,long ID)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }
    
    public Cliente()
    {
        this("Will","Mora",123);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "--Cliente---" + "\nnombre: " +nombre + "\napellido: " +apellido + "\nID: " +ID;
    }
    
    
}
