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
public class GPU extends Producto {

    String memoriaVram;
    String sgram;
    static ArrayList<GPU> gpus = new ArrayList<>();

    public GPU() {
    }

    public GPU(String memoriaVram, String sgram, String marca, String modelo, int precio) {
        super(marca, modelo, precio);
        this.memoriaVram = memoriaVram;
        this.sgram = sgram;
    }

    public String getMemoriaVram() {
        return memoriaVram;
    }

    public void setMemoriaVram(String memoriaVram) {
        this.memoriaVram = memoriaVram;
    }

    public String getSgram() {
        return sgram;
    }

    public void setSgram(String sgram) {
        this.sgram = sgram;
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

    public ArrayList<GPU> getGpus() {
        return gpus;
    }

    public void setGpus(ArrayList<GPU> gpus) {
        this.gpus = gpus;
    }

    @Override
    public String toString() {
        return super.toString() + " Memoria VRAM: " + this.memoriaVram + " Tipo de SGRAM: " + this.sgram + " Precio: " + this.precio;
    }

}
