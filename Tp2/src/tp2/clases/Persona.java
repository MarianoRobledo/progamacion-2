/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

import java.time.LocalDate;

/**
 *
 * @author mariano-ubuntu
 */
abstract class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected LocalDate fechaNacimiento;
    protected String direccion;
    protected String telefono;

    public Persona(String nombre, String apellido, int dni, LocalDate fechaNacimiento, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

}
