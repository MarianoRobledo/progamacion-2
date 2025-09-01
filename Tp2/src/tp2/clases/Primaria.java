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
public class Primaria extends Escuela{
    
    private Director director;
    private List<Docente> docentes;
    private List<Alumno> alumnos;
    private List<Materia> materias;
    private List<Curso> cursos;

    public Primaria() {
    }

   

    public Primaria(Director director, String nombre, int numeroEscuela, String direccion, String email) {
        super(nombre, numeroEscuela, direccion, email);
        this.director = director;
        this.docentes = new ArrayList<Docente>();
        this.alumnos = new ArrayList<Alumno>();
        this.materias = new ArrayList<Materia>();
        this.cursos = new ArrayList<Curso>();
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
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
    
    
    public void agregarMateria(Materia materia){
        this.materias.add(materia);
    }
    
    public void quitarMateria(int codigo){
        Iterator<Materia> itMateria = this.materias.iterator();
        boolean flag=true;
        
        while(itMateria.hasNext()){
            
            if(itMateria.next().getCodigo()==codigo){
                itMateria.remove();
                System.out.println("Se elimino");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("No se encontro el codigo: "+codigo);
        }
        
    }
    
    public void inscribirAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    
    public void darDeBajaAlumno(int legajo){
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
    
    public void listarAlumnos(){
        for (Alumno alumno : this.alumnos) {
            System.out.println(alumno.toString());
        }
    }
    
    public void agregarDocente(Docente docente){
        this.docentes.add(docente);
    }
    
    public void quitarDocente(int legajo){
        Iterator<Docente> itDocente = this.docentes.iterator();
        boolean flag=true;
        
        while(itDocente.hasNext()){
            
            if(itDocente.next().getLegajo()==legajo){
                itDocente.remove();
                System.out.println("Se elimino");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("No se encontro el legajo: "+legajo);
        }
                
    }
    
    public void listarDocentes(){
        for(Docente docentes : this.docentes){
            System.out.println(docentes.toString());
        }
    }
    
    public void organizarActoEscolar(Sum lugar){
        
    }
    
    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }
    
    public void quitarCurso(int identificador){
        Iterator<Curso> itCurso = this.cursos.iterator();
        boolean flag=true;
        
        while(itCurso.hasNext()){
            
            if(itCurso.next().getIdentificador()==identificador){
                itCurso.remove();
                System.out.println("Se elimino");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("No se encontro el identificador: "+identificador);
        }
    }
    
    public void listarCurso(){
        for(Curso curso : this.cursos){
            System.out.println(curso.toString());
        }
    }
    
    

    @Override
    void abrirEscuela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void cerrarEscuela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
