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
public class Articulo {
    
    private String codigo,descripccion;
    private double valorVenta,unidadesVendidas;

    public Articulo(String codigo, String descripccion, double valorVenta, double unidadesVendidas) {
        this.codigo = codigo;
        this.descripccion = descripccion;
        this.valorVenta = valorVenta;
        this.unidadesVendidas = unidadesVendidas;
    }

    public Articulo() 
    {
        this("ASD33","Papa",1000,3);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public double getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(double unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }
    
    
    public double precioArticulo()
    {
        return this.valorVenta * this.unidadesVendidas;
    }
    
    
}
