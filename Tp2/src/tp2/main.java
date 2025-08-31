/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Date;
import tp2.clases.Alumno;
import tp2.clases.Aula;
import tp2.clases.Director;
import tp2.clases.Docente;
import tp2.clases.Laboratorio;
import tp2.clases.Patio;
import tp2.clases.Sum;
import tp2.clases.TipoLaboratorio;

/**
 *
 * @author mariano-ubuntu
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Patio p1 = new Patio(150, true, true, false, "Patio Delantero", "A1");
        Patio p2 = new Patio(200, true, false, true, "Patio Tracer", "B1");
        Sum s1 = new Sum(80, true, true, "Sum Profesores", "A2");
        Laboratorio lab1 = new Laboratorio(TipoLaboratorio.COMPUTACION, "Laboratorio de Computacion", "C1");
        Aula aula1 = new Aula(30, true, "A1", "D1");
        Aula aula2 = new Aula(30, true, "A2", "D2");
        Aula aula3 = new Aula(30, true, "A3", "D3");
        Aula aula4 = new Aula(30, true, "A4", "D4");
        Aula aula5 = new Aula(30, true, "A5", "D5");

        Director d1 = new Director(1234, new Date(2000, 1, 12), "Marcelo", "Rodrigez", 1234, new Date(1985, 1, 12), "Floresta", "2635644");
        Docente doc1 = new Docente(14778, "Matematica", new Date(2000, 1, 12), "Maria", "Gonzalez", 14778, new Date(2000, 1, 12), "Mendoza", "2644666");
        Docente doc2 = new Docente(15555, "Matematica", new Date(2000, 1, 12), "Marcos", "Perez", 15555, new Date(2000, 1, 12), "Mendoza", "2644666");
        Docente doc3 = new Docente(17777, "Matematica", new Date(2000, 1, 12), "Carlos", "Gaviola", 17777, new Date(2000, 1, 12), "Mendoza", "2644666");
        Docente doc4 = new Docente(18888, "Matematica", new Date(2000, 1, 12), "Esteban", "Fernandez", 18888, new Date(2000, 1, 12), "Mendoza", "2644666");
        Docente doc5 = new Docente(19999, "Matematica", new Date(2000, 1, 12), "Brisa", "Olivares", 19999, new Date(2000, 1, 12), "Mendoza", "2644666");

        Alumno alumno1 = new Alumno(2000, "Juan", "Perez", 2000, new Date(2000, 1, 12), "mendoza", "262334");
        Alumno alumno2 = new Alumno(2111, "Abril", "Gomez", 2001, new Date(2001, 2, 10), "mendoza", "262335");

        // Probar métodos sobrecargados en Alumno
        alumno1.agregarCalificacion(10.0, "Matemática");
        alumno1.agregarCalificacion(8.5);
        alumno1.agregarCalificacion(new tp2.clases.Calificacion(7.0, "Lengua"));

        // Probar métodos sobrecargados en Docente
        int antiguedad1 = doc1.calcularAntiguedad();
        int antiguedad2 = doc1.calcularAntiguedad(new Date(2025, 1, 1));
        System.out.println("Antigüedad actual: " + antiguedad1);
        System.out.println("Antigüedad al 2025: " + antiguedad2);

        // Polimorfismo: colección de EspacioEscolar
        java.util.ArrayList<tp2.clases.EspacioEscolar> espacios = new java.util.ArrayList<>();
        espacios.add(aula1);
        espacios.add(lab1);
        espacios.add(p1);
        espacios.add(s1);

        for (tp2.clases.EspacioEscolar esp : espacios) {
            System.out.println(esp.descripcion());
        }
    }
    
}
