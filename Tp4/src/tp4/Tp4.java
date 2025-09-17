/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

import java.util.ArrayList;

/**
 *
 * @author mariano-ubuntu
 */
public class Tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Casa matriz 
        CasaNeumaticos casa = new CasaNeumaticos("Bologne-sur-Mer");
        
        //Empleados de la casa de neumaticos
        Empleado emp1 = new Empleado(1, "Juan", 26345);
        Empleado emp2 = new Empleado(2, "Julio", 24755);
        
        //Clientes de la casa de neumaticos
        Cliente cl1 = new Cliente(41);
        Cliente cl2 = new Cliente(42);
        
        //Provedor de neumaticos
        Provedor provedor = new Provedor("Firestone");
        
        //Neumaticos de algun Provedor
        Neumatico neumatico = new Neumatico(20, "Fire", provedor);
        provedor.setNeumatico(neumatico);
        
        //Empleado realiza una venta y lo asocia a un cliente
        emp1.registrarVenta(cl1, 22);
        emp1.registrarVenta(cl1, 12);
        
        ArrayList<Venta> ventas = cl1.getVentas();
        
        //Se muestra las ventas registrada a dicho cliente
        for(Venta venta: ventas){
            System.out.println(venta.toString());
        }
        
        

        
        
        
    }
    
}
