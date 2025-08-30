/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

/**
 *
 * @author mariano-ubuntu
 */
public class Sum extends EspacioEscolar{
    
    private int capacidad;
    private boolean tieneCalefaccion;
    private boolean tieneProyector;

    public Sum() {
    }

    
    public Sum(int capacidad, boolean tieneCalefaccion, boolean tieneProyector, String nombre, String ubicacion) {
        super(nombre, ubicacion, true);
        this.capacidad = capacidad;
        this.tieneCalefaccion = tieneCalefaccion;
        this.tieneProyector = tieneProyector;
    }

    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isTieneCalefaccion() {
        return tieneCalefaccion;
    }

    public void setTieneCalefaccion(boolean tieneCalefaccion) {
        this.tieneCalefaccion = tieneCalefaccion;
    }

    public boolean isTieneProyector() {
        return tieneProyector;
    }

    public void setTieneProyector(boolean tieneProyector) {
        this.tieneProyector = tieneProyector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    
    
    public void realizarActo(){
        
    }
    
    public void realizarReunion(){
        
    }
    
    public void realizarDeporte(){
        
    }

    @Override
    void abrir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void cerrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
