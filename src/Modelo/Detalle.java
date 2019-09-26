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
public class Detalle {
    
    private Articulo articulos[];
    private int aRegistrados;

    public Detalle() {
        this.articulos = new Articulo[5];
        this.aRegistrados = 0;
    }

    public Articulo[] getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo[] articulos) {
        this.articulos = articulos;
    }

    public int getaRegistrados() {
        return aRegistrados;
    }

    public void setaRegistrados(int aRegistrados) {
        this.aRegistrados = aRegistrados;
    }
    
    
    public void addArticulo(Articulo a)
    {
        if(this.aRegistrados < this.articulos.length)
            this.articulos[this.aRegistrados] = a;
        
        this.aRegistrados++;
    }
    
    public double  calcularsubtotal()
    {
        double total = 0;
        
        for(int i = 0; i<this.aRegistrados; i++)
        {
            total += this.articulos[i].precioArticulo();
            
        }
        return total;
    }
    
}
