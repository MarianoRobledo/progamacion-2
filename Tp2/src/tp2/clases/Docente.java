/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author mariano-ubuntu
 */
public class Docente extends Persona{
    
    private int legajo;
    private String especialida;
    private LocalDate fechaInicioCargo;

    public Docente(int legajo, String especialida, LocalDate fechaInicioCargo, String nombre, String apellido, int dni, LocalDate fechaNacimiento, String direccion, String telefono) {
        super(nombre, apellido, dni, fechaNacimiento, direccion, telefono);
        this.legajo = legajo;
        this.especialida = especialida;
        this.fechaInicioCargo = fechaInicioCargo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getEspecialida() {
        return especialida;
    }

    public void setEspecialida(String especialida) {
        this.especialida = especialida;
    }

    public LocalDate getFechaInicioCargo() {
        return fechaInicioCargo;
    }

    public void setFechaInicioCargo(LocalDate fechaInicioCargo) {
        this.fechaInicioCargo = fechaInicioCargo;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
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

    // Métodos sobrecargados
    public int calcularAntiguedad() {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaInicioCargo, hoy);
        return Math.max(periodo.getYears(), 0);
    }

    public int calcularAntiguedad(LocalDate fechaReferencia) {
        Period periodo = Period.between(fechaInicioCargo, fechaReferencia);
        return Math.max(periodo.getYears(), 0);
    }

    @Override
    public String toString() {
        return "Docente{nombre= " + this.nombre + ", apellido= " + apellido + ", dni= " + dni + ", " + "legajo= " + legajo + ", especialidad= " + especialida +'}';
    }

}
