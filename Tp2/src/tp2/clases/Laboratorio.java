/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mariano-ubuntu
 */
public class Laboratorio extends EspacioEscolar{
    
    private TipoLaboratorio tipo;
    private List<String> equipamiento;

    public Laboratorio() {
    }
   
    public Laboratorio(TipoLaboratorio tipo, String nombre, String ubicacion) {
        super(nombre, ubicacion, true);
        this.tipo = tipo;
        this.equipamiento = new ArrayList<String>();
    }

    public TipoLaboratorio getTipo() {
        return tipo;
    }

    public void setTipo(TipoLaboratorio tipo) {
        this.tipo = tipo;
    }

    public List<String> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<String> equipamiento) {
        this.equipamiento = equipamiento;
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
    
    public void agregarEquipo(String equipo){
        this.equipamiento.add(equipo);
        //hay que chequear que exista la lista sino rompe todo
    }
    
    public void consultarEquipo(){
        //ver el uml porque pide parametro ¿es necesario?
        for (int i = 0; i < this.equipamiento.size(); i++) {
            System.out.println(equipamiento.get(i));            
        }
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
    
    @Override
    public String descripcion() {
        return "Laboratorio: " + nombre + ", tipo: " + tipo;
    }    
    
}
