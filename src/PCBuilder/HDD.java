/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCBuilder;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class HDD extends Producto {

    String memoria;
    String velocidad;
    static ArrayList<HDD> hdds = new ArrayList<>();

    public HDD() {
    }
    

    public HDD(String memoria, String velocidad, String marca, String modelo, int precio) {
        super(marca, modelo, precio);
        this.memoria = memoria;
        this.velocidad = velocidad;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getTipo() {
        return velocidad;
    }

    public void setTipo(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<HDD> getHdds() {
        return hdds;
    }

    public void setHdds(ArrayList<HDD> hdds) {
        this.hdds = hdds;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Memoria: " + this.memoria + " Velocidad: " + this.velocidad + " Precio: " + this.precio; 
    }

}
