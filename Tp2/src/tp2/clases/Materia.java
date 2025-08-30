/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

/**
 *
 * @author mariano-ubuntu
 */
public class Materia {
    
    private int codigo;
    private String nombre;
    private Docente titular;
    private int cargaHoraria;

    public Materia() {
    }

    public Materia(int codigo, String nombre, Docente titular, int cargaHoraria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.titular = titular;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getTitular() {
        return titular;
    }

    public void setTitular(Docente titular) {
        this.titular = titular;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
}
