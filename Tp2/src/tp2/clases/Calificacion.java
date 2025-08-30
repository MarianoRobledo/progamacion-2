/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

/**
 *
 * @author mariano-ubuntu
 */
public class Calificacion {
    
    private int legajo;
    private Materia materia;
    private int valor;

    public Calificacion() {
    }

    public Calificacion(int legajo, Materia materia, int valor) {
        this.legajo = legajo;
        this.materia = materia;
        this.valor = valor;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
