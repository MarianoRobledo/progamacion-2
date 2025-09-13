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
    private int cantidadNeumaticos;

    public Venta() {
    }

    public Venta(Date fecha, Cliente cliente, int cantidadNeumaticos) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.cantidadNeumaticos = cantidadNeumaticos;
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

    public int getCantidadNeumaticos() {
        return cantidadNeumaticos;
    }

    public void setCantidadNeumaticos(int cantidadNeumaticos) {
        this.cantidadNeumaticos = cantidadNeumaticos;
    }

    public void registrarVenta() {

        this.factura = new Factura(cantidadNeumaticos);

    }

    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", cliente=" + cliente + ", factura=" + factura + ", cantidadNeumaticos=" + cantidadNeumaticos + '}';
    }

    

}
