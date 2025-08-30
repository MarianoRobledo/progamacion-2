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
abstract class Escuela {
    
    protected String nombre;
    protected int numeroEscuela;
    protected String direccion;
    protected List<Integer> telefono;
    protected String email;
    protected List<Patio> patios;
    protected List<Sum> sums;
    protected List<Laboratorio> laboratorios;
    protected List<Aula> aulas;

    public Escuela() {
    }

    public Escuela(String nombre, int numeroEscuela, String direccion, String email) {
        this.nombre = nombre;
        this.numeroEscuela = numeroEscuela;
        this.direccion = direccion;
        this.telefono = new ArrayList<Integer>();
        this.email = email;
        this.patios = new ArrayList<Patio>();
        this.sums = new ArrayList<Sum>();
        this.laboratorios = new ArrayList<Laboratorio>();
        this.aulas = new ArrayList<Aula>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEscuela() {
        return numeroEscuela;
    }

    public void setNumeroEscuela(int numeroEscuela) {
        this.numeroEscuela = numeroEscuela;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Integer> getTelefono() {
        return telefono;
    }

    public void setTelefono(List<Integer> telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Patio> getPatios() {
        return patios;
    }

    public void setPatios(List<Patio> patios) {
        this.patios = patios;
    }

    public List<Sum> getSums() {
        return sums;
    }

    public void setSums(List<Sum> sums) {
        this.sums = sums;
    }

    public List<Laboratorio> getLaboratorios() {
        return laboratorios;
    }

    public void setLaboratorios(List<Laboratorio> laboratorios) {
        this.laboratorios = laboratorios;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

   abstract void abrirEscuela();
   
   abstract void cerrarEscuela();
    
    
    
}
