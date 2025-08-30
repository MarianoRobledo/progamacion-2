/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mariano-ubuntu
 */
public class Alumno extends Persona{
    
    private int legajo;
    private List<Calificacion> calificaciones;

   
    public Alumno(int legajo, String nombre, String apellido, int dni, Date fechaNacimiento, String direccion, String telefono) {
        super(nombre, apellido, dni, fechaNacimiento, direccion, telefono);
        this.legajo = legajo;
        this.calificaciones = new ArrayList<Calificacion>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public List getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", calificaciones=" + calificaciones + '}';
    }
    
    
}
