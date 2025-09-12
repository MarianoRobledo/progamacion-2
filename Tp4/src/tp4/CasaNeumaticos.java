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
public class CasaNeumaticos {
    
    private int nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Provedor> provedores;

    public CasaNeumaticos() {
    }

    public CasaNeumaticos(int nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<Cliente>();
        this.empleados = new ArrayList<Empleado>();
        this.provedores = new ArrayList<Provedor>();
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Provedor> getProvedores() {
        return provedores;
    }

    public void setProvedores(ArrayList<Provedor> provedores) {
        this.provedores = provedores;
    }

    @Override
    public String toString() {
        return "CasaNeumaticos{" + "nombre=" + nombre + ", clientes=" + clientes + ", empleados=" + empleados + ", provedores=" + provedores + '}';
    }
    
    
    
    
}
