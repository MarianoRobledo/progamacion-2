/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

import java.util.Date;

/**
 *
 * @author mariano-ubuntu
 */
public class Docente extends Persona{
    
    private int legajo;
    private String especialida;
    private Date fechaInicioCargo;

    public Docente(int legajo, String especialida, Date fechaInicioCargo, String nombre, String apellido, int dni, Date fechaNacimiento, String direccion, String telefono) {
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

    public Date getFechaInicioCargo() {
        return fechaInicioCargo;
    }

    public void setFechaInicioCargo(Date fechaInicioCargo) {
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

    // Métodos sobrecargados
    public int calcularAntiguedad() {
        // Retorna años de antigüedad desde fechaInicioCargo hasta hoy
        Date hoy = new Date();
        long diff = hoy.getTime() - fechaInicioCargo.getTime();
        return (int) (diff / (1000L * 60 * 60 * 24 * 365));
    }

    public int calcularAntiguedad(Date fechaReferencia) {
        long diff = fechaReferencia.getTime() - fechaInicioCargo.getTime();
        return (int) (diff / (1000L * 60 * 60 * 24 * 365));
    }

    @Override
    public String toString() {
        return "Docente{" + "legajo=" + legajo + ", especialida=" + especialida + ", fechaInicioCargo=" + fechaInicioCargo + '}';
    }
    
}
