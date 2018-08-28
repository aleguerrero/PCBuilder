/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCBuilder;

/**
 *
 * @author Alejandro Guerrero A
 */
public class Cotizacion {

    static private CPU cpu;
    static private MoBo mobo;
    static private RAM ram;
    static private GPU gpu;
    static private HDD hdd;
    static private PSU psu;
    static int price;

    public Cotizacion() {
    }

    public static CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        Cotizacion.cpu = cpu;
    }

    public static MoBo getMobo() {
        return mobo;
    }

    public void setMobo(MoBo mobo) {
        Cotizacion.mobo = mobo;
    }

    public static RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        Cotizacion.ram = ram;
    }

    public static GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        Cotizacion.gpu = gpu;
    }

    public static HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        Cotizacion.hdd = hdd;
    }

    public static PSU getPsu() {
        return psu;
    }

    public void setPsu(PSU psu) {
        Cotizacion.psu = psu;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Cotizacion.price = price;
    }

    public static void precio(int n) {
        int precio = n + getPrice();
        setPrice(precio);
    }

    @Override
    public String toString() {
        return "Partes:" + "\n" + "Procesador: " + cpu + "\n" + "Tarjeta Madre: " + mobo + "\n" + "RAM: " + ram + "\n" + "Tarjeta Gráfica: " + gpu + "\n" + "Disco Duro: " + hdd + "\n" + "Fuente de Poder: " + psu + "\n" + "Precio: " + price;
    }
}
