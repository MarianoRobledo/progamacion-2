/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mariano-ubuntu
 */
public class ListaTareas {

    private ArrayList<Tarea> tareas;

    public ListaTareas() {
        this.tareas = new ArrayList<Tarea>();
    }

    public ListaTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }
    

    public void agregarTareas(Tarea tarea) {
        try {
            tareas.add(tarea);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Tiene que ser un ojeto Tarea");
        }

    }

    public void mostraTarea() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea.toString());
        }
    }

    public Tarea obtenerTarea(String nombre) {
        Tarea devolver = null;
        try {
            for (Tarea tarea : tareas) {
                if (tarea.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                    devolver = tarea;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Se debe pasar un tipo String");
        }
        if (devolver == null) {
            System.out.println("No se encontro la tarea");
            return null;
        } else {
            return devolver;
        }
    }

    public Tarea obtenerTarea(int index) {
        Tarea devolver = null;
        try {
            devolver = tareas.get(index);
        } catch (Exception e) {
            System.out.println("Fuera de indice");
        }
        if (devolver == null) {
            System.out.println("No se encontro la tarea");
            return null;
        } else {
            return devolver;
        }
    }

    public boolean contieneTarea(Tarea tarea) {
        boolean flag = false;
        try {
            if (tareas.contains(tarea)) {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println("Tiene que ser una tarea");
        }
        return flag;
    }

    public int indeceTarea(Tarea tarea) {
        int res = -1;
        try {
            res = tareas.indexOf(tarea);
        } catch (Exception e) {
            System.out.println("Tiene que ser una tarea");
        }
        if (res == -1) {
            System.out.println("No se encontro tarea");
            return res;
        } else {
            return res;
        }
    }

    public void eliminarTarea(Tarea tarea) {
        try {
            Iterator<Tarea> itTareas = tareas.iterator();
            while (itTareas.hasNext()) {
                if (itTareas.next().equals(tarea)) {
                    itTareas.remove();
                }

            }
        } catch (Exception e) {
            System.out.println("Fuego");
        }

    }

    public void eliminarTarea(int indice) {
        try {
            if (indice > tareas.size()) {
                System.out.println("Indice mas grande que elementos, no se puede");
            } else {
                Iterator<Tarea> itTareas = tareas.iterator();
                while (itTareas.hasNext()) {
                    Tarea t = itTareas.next();
                    if (indice == 0) {
                        itTareas.remove();
                        break;
                    }
                    indice = indice - 1;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fuego");
        }
    }

    public void limpiarTarea() {
        tareas.clear();
    }

    public boolean estaVacia() {
        return tareas.isEmpty();
    }
    
    public List<Tarea> clonarLista(){
        return (ArrayList) tareas.clone();
    }
    
}
