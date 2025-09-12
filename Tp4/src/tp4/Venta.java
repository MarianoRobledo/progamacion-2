/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mariano-ubuntu
 */
public class Venta {
    
    private Date fecha;
    private Cliente cliente;
    private Factura factura;
    private ArrayList<Neumatico> neumaticos;

    public Venta() {
    }

    public Venta(Date fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.neumaticos = new ArrayList<Neumatico>();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public ArrayList<Neumatico> getNeumaticos() {
        return neumaticos;
    }

    public void setNeumaticos(ArrayList<Neumatico> neumaticos) {
        this.neumaticos = neumaticos;
    }
    
    public void agregarNeumaticos(Neumatico neumatico){
        neumaticos.add(neumatico);        
    }

    
    public void registrarVenta(){
        
    }
    
    
    
    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", cliente=" + cliente + ", factura=" + factura + ", neumaticos=" + neumaticos + '}';
    }
    
    
    
    
}
