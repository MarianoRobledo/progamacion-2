/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import java.util.ArrayList;

/**
 *
 * @author mariano-ubuntu
 */
public class Cliente {
    
    private int dni;
    private ArrayList<Venta> ventas;

    public Cliente() {
    }

    public Cliente(int dni) {
        this.dni = dni;
        this.ventas = new ArrayList<Venta>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList ventas) {
        this.ventas = ventas;
    }
    
    public void agregarCompra(Venta venta){
        ventas.add(venta);
    }
    
}
