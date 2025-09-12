/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import java.util.Date;

/**
 *
 * @author mariano-ubuntu
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private int telefono;

    public Empleado() {
    }

    public Empleado(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void registrarVenta(Cliente cliente){
        Venta venta = new Venta(new Date(), cliente);
        venta.agregarNeumaticos(new Neumatico);
        cliente.agregarCompra(venta);
    }
    
}
