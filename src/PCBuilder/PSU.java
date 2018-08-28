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
public class PSU extends Producto {

    String wattage;
    String certificado;
    static ArrayList<PSU> psus = new ArrayList<>();

    public PSU() {
    }

    public PSU(String wattage, String certificado, String marca, String modelo, int precio) {
        super(marca, modelo, precio);
        this.wattage = wattage;
        this.certificado = certificado;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
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

    public ArrayList<PSU> getPsus() {
        return psus;
    }

    public void setPsus(ArrayList<PSU> psus) {
        this.psus = psus;
    }

    @Override
    public String toString() {
        return super.toString() + " Wattage " + this.wattage + " Certificado: " + this.certificado + " Precio: " + this.precio; 
    }

}
