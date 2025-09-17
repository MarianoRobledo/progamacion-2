/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mariano-ubuntu
 */
public class CasaNeumaticos {

    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Neumatico> neumaticos;
    private ArrayList<Provedor> provedores;

    public CasaNeumaticos() {
    }

    public CasaNeumaticos(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<Cliente>();
        this.empleados = new ArrayList<Empleado>();
        this.neumaticos = new ArrayList<Neumatico>();
        this.provedores = new ArrayList<Provedor>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
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

    public ArrayList<Neumatico> getNeumaticos() {
        return neumaticos;
    }

    public void setNeumaticos(ArrayList<Neumatico> neumaticos) {
        this.neumaticos = neumaticos;
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void eliminarEmpleado(int id){
        Iterator<Empleado> it = empleados.iterator();
        
        while(it.hasNext()){
            if(it.next().getId()==id){
                it.remove();
            }
        }
        
    }

    @Override
    public String toString() {
        return "CasaNeumaticos{" + "nombre=" + nombre + ", clientes=" + clientes + ", empleados=" + empleados + ", provedores=" + provedores + '}';
    }

}
