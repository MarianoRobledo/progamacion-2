/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.time.LocalDate;
import tp2.clases.Alumno;
import tp2.clases.Aula;
import tp2.clases.Calificacion;
import tp2.clases.Director;
import tp2.clases.Docente;
import tp2.clases.EspacioEscolar;
import tp2.clases.Laboratorio;
import tp2.clases.Patio;
import tp2.clases.Primaria;
import tp2.clases.Sum;
import tp2.clases.TipoLaboratorio;

/**
 *
 * @author mariano-ubuntu
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Patio p1 = new Patio(150, true, true, false, "Patio Delantero", "A1");
        Patio p2 = new Patio(200, true, false, true, "Patio Tracer", "B1");
        Sum s1 = new Sum(80, true, true, "Sum Profesores", "A2");
        Laboratorio lab1 = new Laboratorio(TipoLaboratorio.COMPUTACION, "Laboratorio de Computacion", "C1");
        Aula aula1 = new Aula(30, true, "A1", "D1");
        Aula aula2 = new Aula(30, true, "A2", "D2");
        Aula aula3 = new Aula(30, true, "A3", "D3");
        Aula aula4 = new Aula(30, true, "A4", "D4");
        Aula aula5 = new Aula(30, true, "A5", "D5");

        Director d1 = new Director(1234, LocalDate.of(2000, 1, 12), "Marcelo", "Rodrigez", 1234, LocalDate.of(1985, 1, 12), "Floresta", "2635644");
        Docente doc1 = new Docente(14778, "Matematica", LocalDate.of(2000, 1, 12), "Maria", "Gonzalez", 14778, LocalDate.of(2000, 1, 12), "Mendoza", "2644666");
        Docente doc2 = new Docente(15555, "Lenguas", LocalDate.of(2000, 1, 12), "Marcos", "Perez", 15555, LocalDate.of(2000, 1, 12), "Mendoza", "2644666");
        Docente doc3 = new Docente(17777, "Cs. Naturales", LocalDate.of(2000, 1, 12), "Carlos", "Gaviola", 17777, LocalDate.of(2000, 1, 12), "Mendoza", "2644666");
        Docente doc4 = new Docente(18888, "Fisica", LocalDate.of(2000, 1, 12), "Esteban", "Fernandez", 18888, LocalDate.of(2000, 1, 12), "Mendoza", "2644666");
        Docente doc5 = new Docente(19999, "Termodinamica", LocalDate.of(2000, 1, 12), "Brisa", "Olivares", 19999, LocalDate.of(2000, 1, 12), "Mendoza", "2644666");

        Alumno alumno1 = new Alumno(2000, "Juan", "Perez", 2000, LocalDate.of(2000, 1, 12), "mendoza", "262334");
        Alumno alumno2 = new Alumno(2111, "Abril", "Gomez", 2001, LocalDate.of(2001, 2, 10), "mendoza", "262335");
        
        Primaria primaria = new Primaria(d1, "Nacional", 1920, "Mendoza", "nacional@mendoza.edu.ar");
        
        primaria.agregarDocente(doc1);
        primaria.agregarDocente(doc2);
        primaria.agregarDocente(doc3);
        primaria.agregarDocente(doc4);
        primaria.agregarDocente(doc5);
        
        primaria.inscribirAlumno(alumno1);
        primaria.inscribirAlumno(alumno2);
        
        // Probamos el metodo listarDocentes de la clase Primaria        
        primaria.listarDocentes();
        
        
        // Probar Getters y Setters
        System.out.println("El apellido del alumno1: "+alumno1.getApellido());
        System.out.println("Se cambiara por Gonzalez");
        alumno1.setApellido("Gonzalez");
        System.out.println("El nuevo apellido del alumno1: "+alumno1.getApellido());
        
        
        // Probar métodos sobrecargados en Alumno
        alumno1.agregarCalificacion(10.0, "Matemática");
        alumno1.agregarCalificacion(8.5);
        alumno1.agregarCalificacion(new Calificacion(7.0, "Lengua"));
        
        System.out.println("----------------------");

        // Probar métodos sobrecargados en Docente
        int antiguedad1 = doc1.calcularAntiguedad();
        int antiguedad2 = doc1.calcularAntiguedad(LocalDate.of(2025, 1, 1));
        System.out.println("Antigüedad actual: " + antiguedad1 + " años");
        System.out.println("Antigüedad al 2025: " + antiguedad2 + " años");

        // Polimorfismo: colección de EspacioEscolar
        ArrayList<EspacioEscolar> espacios = new ArrayList<>();
        espacios.add(aula1);
        espacios.add(lab1);
        espacios.add(p1);
        espacios.add(s1);

        for (EspacioEscolar esp : espacios) {
            System.out.println(esp.descripcion());
        }
    }
    
}
