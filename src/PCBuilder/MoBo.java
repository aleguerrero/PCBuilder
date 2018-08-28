/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCBuilder;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Guerrero A
 */
public class MoBo extends Producto {

    String socket;
    static ArrayList<MoBo> mobos = new ArrayList<>();

    public MoBo() {
    }

    public MoBo(String socket, String marca, String modelo, int precio) {
        super(marca, modelo, precio);
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public static ArrayList<MoBo> getMobos() {
        return mobos;
    }

    public static void setMobos(ArrayList<MoBo> mobos) {
        MoBo.mobos = mobos;
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
        return super.toString() + " Socket " + this.socket + " Precio: " + this.precio;
    }
}
