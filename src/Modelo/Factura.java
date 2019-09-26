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
public class Factura {
    
    private Cliente cliente;
    private Detalle detalle;
    private double importe,subTotal,descuento;
    
    private static final double IVA = 0.19;

    public Factura(Cliente cliente, double descuento) {
        this.cliente = cliente;
        this.descuento = descuento;
        this.detalle = new Detalle();
    }

    public Factura() {
    
      this(null,0);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    public void calcularFactura(){
        
        this.subTotal = this.detalle.calcularsubtotal();
        this.importe = this.subTotal*(1 + Factura.IVA - this.descuento);
    }


   public void addArticulo(Articulo a)
   {
      this.detalle.addArticulo(a);
   }
    
    
    
    
}
