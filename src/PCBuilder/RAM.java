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
public class RAM extends Producto {

    String memoriaRAM;
    String tipoMemoria;
    String clock;
    static ArrayList<RAM> rams = new ArrayList<>();

    public RAM() {
    }
    

    public RAM(String memoriaRAM, String tipoMemoria, String clock, String marca, String modelo, int precio) {
        super(marca, modelo, precio);
        this.memoriaRAM = memoriaRAM;
        this.tipoMemoria = tipoMemoria;
        this.clock = clock;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
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

    public ArrayList<RAM> getRams() {
        return rams;
    }

    public void setRams(ArrayList<RAM> rams) {
        this.rams = rams;
    }

    @Override
    public String toString() {
        return super.toString() + " Memoria RAM: " + this.memoriaRAM + " Tipo Memoria: " + this.tipoMemoria + " @ " + this.clock + " Precio: " + this.precio;
    }

}
