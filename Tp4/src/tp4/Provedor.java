/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author mariano-ubuntu
 */
public class Provedor {
    
    private String razonSocial;
    private Neumatico neumatico;

    public Provedor() {
    }

    public Provedor(String razonSocial ) {
        this.razonSocial = razonSocial;
        
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Neumatico getNeumatico() {
        return neumatico;
    }

    public void setNeumatico(Neumatico neumatico) {
        this.neumatico = neumatico;
    }
    
    public void pedirNeumatico(){
        this.neumatico.actualizaStock(20);
    }
}
