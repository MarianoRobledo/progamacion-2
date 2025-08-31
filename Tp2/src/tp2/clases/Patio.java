/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.clases;

/**
 *
 * @author mariano-ubuntu
 */
public class Patio extends EspacioEscolar {

    private int superficie;
    private boolean tieneJuegos;
    private boolean tieneCanchaFutbol;
    private boolean tieneChanchaBasket;
    

    public Patio() {
    }

    public Patio(int superficie, boolean tieneJuegos, boolean tieneCanchaFutbol, boolean tieneChanchaBasket, String nombre, String ubicacion) {
        super(nombre, ubicacion, true);
        this.superficie = superficie;
        this.tieneJuegos = tieneJuegos;
        this.tieneCanchaFutbol = tieneCanchaFutbol;
        this.tieneChanchaBasket = tieneChanchaBasket;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public boolean isTieneJuegos() {
        return tieneJuegos;
    }

    public void setTieneJuegos(boolean tieneJuegos) {
        this.tieneJuegos = tieneJuegos;
    }

    public boolean isTieneCanchaFutbol() {
        return tieneCanchaFutbol;
    }

    public void setTieneCanchaFutbol(boolean tieneCanchaFutbol) {
        this.tieneCanchaFutbol = tieneCanchaFutbol;
    }

    public boolean isTieneChanchaBasket() {
        return tieneChanchaBasket;
    }

    public void setTieneChanchaBasket(boolean tieneChanchaBasket) {
        this.tieneChanchaBasket = tieneChanchaBasket;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    @Override
    void abrir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void cerrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String descripcion() {
        return "Patio: " + nombre + ", superficie: " + superficie + " m2";
    }

}
