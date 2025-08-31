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
    private double nota;
    private String nombreMateria;

    public Calificacion() {
    }

    public Calificacion(int legajo, Materia materia, int valor) {
        this.legajo = legajo;
        this.materia = materia;
        this.valor = valor;
    }

    // Constructor sobrecargado para métodos de Alumno
    public Calificacion(double nota, String nombreMateria) {
        this.nota = nota;
        this.nombreMateria = nombreMateria;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    @Override
    public String toString() {
        if (nombreMateria != null) {
            return "Calificacion{" + "nota=" + nota + ", materia='" + nombreMateria + '\'' + '}';
        } else if (materia != null) {
            return "Calificacion{" + "valor=" + valor + ", materia=" + materia + '}';
        } else {
            return "Calificacion{}";
        }
    }
}
