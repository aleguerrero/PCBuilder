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
public class CPU extends Producto {

    String clock;
    static ArrayList<CPU> cpus = new ArrayList<>();

    public CPU() {
    }
    

    public CPU(String clock, String marca, String modelo, int precio) {
        super(marca, modelo, precio);
        this.clock = clock;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public static ArrayList<CPU> getCpus() {
        return cpus;
    }

    public static void setCpus(ArrayList<CPU> cpus) {
        CPU.cpus = cpus;
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

    @Override
    public String toString() {
        return super.toString() + " @ " + this.clock + " Precio: " + this.precio;
    }

    public static void agrega(CPU c){
        cpus.add(c);
    }
}
