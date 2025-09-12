/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author mariano-ubuntu
 */
public class Factura {
    
    private int total;

    public Factura(int total) {
        this.total = total;
    }

    public Factura() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void imprimirFactura(){
        System.out.println(total);
    }

    @Override
    public String toString() {
        return "Factura{" + "total=" + total + '}';
    }
    
    
    
}
