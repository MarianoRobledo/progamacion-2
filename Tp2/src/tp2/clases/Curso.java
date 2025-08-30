/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mariano-ubuntu
 */
public class Curso {
    
    private int identificador;
    private Materia materia;
    private Docente docente;
    private Aula aula;
    private String horario;
    private List<Alumno> alumnos;

    public Curso() {
    }

    public Curso(int identificador, Materia materia, Docente docente, Aula aula, String horario) {
        this.identificador = identificador;
        this.materia = materia;
        this.docente = docente;
        this.aula = aula;
        this.horario = horario;
        this.alumnos = new ArrayList<Alumno>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    
    public void quitarAlumno(int legajo){
        Iterator<Alumno> itAlumno = this.alumnos.iterator();
        boolean flag=true;
        
        while(itAlumno.hasNext()){
            
            if(itAlumno.next().getLegajo()==legajo){
                itAlumno.remove();
                System.out.println("Se elimino");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("No se encontro el legajo: "+legajo);
        }
    }

    @Override
    public String toString() {
        return "Curso{" + "identificador=" + identificador + ", materia=" + materia + ", docente=" + docente + ", aula=" + aula + ", horario=" + horario + '}';
    }
    
    
    
    
}
