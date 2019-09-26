/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;
/**
 *
 * @author UNICESAR-401
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cliente c = new Cliente("Will","Mora",5522);
        Articulo a = new Articulo("1151","Arroz",3000,1);
        Articulo f = new Articulo("551","Fideo",500,2);
        Articulo ace = new Articulo("454","Aceite",4000,1);
        
        
        
        Factura fa = new Factura(c,0.05);
        fa.addArticulo(a);
        fa.addArticulo(f);
        fa.addArticulo(ace);
        
        fa.calcularFactura();
        System.out.println("El subTotal es: "+fa.getSubTotal());
        System.out.println("El Importe es: "+fa.getImporte());
       
    }
}
