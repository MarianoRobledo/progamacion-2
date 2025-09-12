/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author mariano-ubuntu
 */
public class Neumatico {
    
    private int stock;
    private String marca;
    private Provedor provedor;

    public Neumatico(int stock, String marca, Provedor provedor) {
        this.stock = stock;
        this.marca = marca;
        this.provedor = provedor;
    }

    public Neumatico() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Provedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;
    }
    
    
    public void actualizaStock(int valor){
        if(valor > 0){
            this.stock += valor;
        } else {
            this.stock -= valor;
        }
    }
    
}
