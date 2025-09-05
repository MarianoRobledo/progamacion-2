/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

import java.util.ArrayList;
import java.util.Scanner;
import tp3.modelo.ListaTareas;
import tp3.modelo.Tarea;

/**
 *
 * @author mariano-ubuntu
 */
public class Tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Tarea t1 = new Tarea("Hacer cama", "Hacer cama");
        Tarea t2 = new Tarea("Lavar baño", "Lavar baño");
        Tarea t3 = new Tarea("Hacer comida", "Hacer comida");
        Tarea t4 = new Tarea("Limpiar", "Limpiar");
        Tarea t5 = new Tarea("Estudiar", "Estudiar");
        Tarea t6 = new Tarea("Cocinar", "Cocinar");

        ListaTareas list = new ListaTareas();
        list.agregarTareas(t1);
        list.agregarTareas(t2);
        list.agregarTareas(t3);
        list.agregarTareas(t4);
        list.agregarTareas(t5);
        list.agregarTareas(t6);
        
        System.out.println("---------------");
        list.mostraTarea();
        System.out.println("---------------");
        System.out.println(list.contieneTarea(t2));
        System.out.println("---------------");
        System.out.println(list.obtenerTarea("Hacer cama"));
        System.out.println("---------------");
        System.out.println("Eliminar t5");
        list.eliminarTarea(t5);
        System.out.println("---------------");
        list.mostraTarea();
        System.out.println("---------------");
        System.out.println("Eliminar indice 0");
        list.eliminarTarea(0);
        System.out.println("---------------");
        System.out.println("Clonar Lista");
        ArrayList<Tarea> listaTareaCLonada = (ArrayList<Tarea>) list.clonarLista();
        ListaTareas list1 = new ListaTareas(listaTareaCLonada);
        System.out.println("---------------");
        System.out.println("Vaciar y corroborar si esta vacia");
        list.limpiarTarea();
        System.out.println(list.estaVacia());
        System.out.println("---------------");
        System.out.println("Mostrar elementos de la lista clonada");
        list1.mostraTarea();
        
        
        
        
/*
        boolean flag = true;
        String res;
        do {
            System.out.println("------------------Menu------------------");
            System.out.println("1- Agregar Tarea");
            System.out.println("2- Mostrar Tareas");
            System.out.println("3- Obtener Tarea");
            System.out.println("4- Contiene Tarea");
            System.out.println("5- Indice de Tarea");
            System.out.println("6- Eliminar Tarea");
            System.out.println("7- Limpiar Lista");
            System.out.println("8- Lista vacia");
            System.out.println("9- Clonar Lista de Tarea");
            System.out.println("10- Salir");
            res = read.nextLine();

            switch (res) {
                case "1":
                    System.out.println("Dar el nombre de la tarea");
                    String nombre = read.next();
                    System.out.println("Dar la descripcion");
                    String descripcion = read.next();
                    Tarea tarea = new Tarea(nombre, descripcion);
                    list.agregarTareas(tarea);
                    break;
                case "2":
                    System.out.println("");
                    list.mostraTarea();
                    System.out.println("");
                    break;
                case "3":
                    boolean flagCase3 = true;
                    String resCase3;
                    do {
                        System.out.println("1- nombre de materia 2- indice");
                        resCase3 = read.next();
                        flagCase3 = false;
                        if (resCase3.equals("1") || resCase3.equals("2")) {
                            if (resCase3.equals("1")) {
                                System.out.println("Dar el nombre de la materia");
                                resCase3 = read.next();
                                list.obtenerTarea(resCase3);
                            }
                            if (resCase3.equals("2")) {
                                System.out.println("Dar el indice");
                                resCase3 = read.next();
                                list.obtenerTarea(Integer.parseInt(resCase3));
                            }
                        } else {
                            System.out.println("Dar un valor validoñ");
                        }
                    } while (flagCase3);
                    break;
                case "4":
                    
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "10":
                    break;
                default:
                    System.out.println("Dar un valor correcto");
            }

        } while (flag);
*/
    }

}
