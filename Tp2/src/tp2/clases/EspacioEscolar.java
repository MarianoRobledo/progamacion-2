/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

/**
 *
 * @author mariano-ubuntu
 */
public abstract class EspacioEscolar {
    
    protected String nombre;
    protected String ubicacion;
    protected boolean habilitado;

    public EspacioEscolar() {
    }

    public EspacioEscolar(String nombre, String ubicacion, boolean habilitado) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.habilitado = habilitado;
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
    

    abstract void abrir();
    abstract void cerrar();
    abstract void limpiar();

    // Polimorfismo: método para mostrar información
    public String descripcion() {
        return "Espacio escolar genérico: " + nombre;
    }
    
}
