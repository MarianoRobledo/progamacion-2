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
        
        Laboratorio lab1 = new Laboratorio(TipoLaboratorio.COMPUTACION, "Laboratorio de Comuptacion", "C1");
        
        Aula a1 = new Aula(30, true, "A1", "D1");
        Aula a2 = new Aula(30, true, "A2", "D2");
        Aula a3 = new Aula(30, true, "A3", "D3");
        Aula a4 = new Aula(30, true, "A4", "D4");
        Aula a5 = new Aula(30, true, "A5", "D5");
        
        Director d1 = new Director(1234, new Date(2000, 1, 12), "Marcelo", "Rodrigez", 1234, new Date(1985, 1, 12), "Floresta", "2635644");
        
        Docente doc1 = new Docente(14778, "Matematica", new Date(2000, 1, 12), "Maria", "Gonzalez", 14778, new Date(2000, 1, 12), "Mendoza", "2644666");
        Docente doc2 = new Docente(15555, "Matematica", new Date(2000, 1, 12), "Marcos", "Perez", 15555, new Date(2000, 1, 12), "Mendoza", "2644666");
        Docente doc3 = new Docente(17777, "Matematica", new Date(2000, 1, 12), "Carlos", "Gaviola", 17777, new Date(2000, 1, 12), "Mendoza", "2644666");
        Docente doc4 = new Docente(18888, "Matematica", new Date(2000, 1, 12), "Esteban", "Fernandez", 18888, new Date(2000, 1, 12), "Mendoza", "2644666");
        Docente doc5 = new Docente(19999, "Matematica", new Date(2000, 1, 12), "Brisa", "Olivares", 19999, new Date(2000, 1, 12), "Mendoza", "2644666");
        
        
        Alumno a1 = new Alumno(2000, "Juan", "", 2000, new Date(2000, 1, 12), "mendoza", "262334");
        Alumno a2 = new Alumno(2111, "abril", "", 2000, new Date(2000, 1, 12), "mendoza", "262334");
        Alumno a3 = new Alumno(2222, "amparo", "", 2000, new Date(2000, 1, 12), "mendoza", "262334");
        Alumno a4 = new Alumno(2333, "jose", "", 2000, new Date(2000, 1, 12), "mendoza", "262334");
        Alumno a5 = new Alumno(2444, "lucas", "", 2000, new Date(2000, 1, 12), "mendoza", "262334");
        
    }
    
}
