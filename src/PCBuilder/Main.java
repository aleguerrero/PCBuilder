/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCBuilder;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Cuenta segundos de uso
        new ConteoUso().start();

        //Crea CPUs
        new AgregaMetodos().agrega(new CPU("4.0GHz", "Intel", "i7 7700K", 329));
        new AgregaMetodos().agrega(new CPU("3.6GHz", "Intel", "i7 7700", 300));
        new AgregaMetodos().agrega(new CPU("3.5GHz", "Intel", "i5 7600K", 249));
        new AgregaMetodos().agrega(new CPU("3.0GHz", "Intel", "i5 7600", 200));

        //Crea GPUs
        new AgregaMetodos().agrega(new GPU("8GB", "GDDR5X", "Nvidia", "GTX 1080Ti", 699));
        new AgregaMetodos().agrega(new GPU("8GB", "GDDR5", "Nvidia", "GTX 1080", 499));
        new AgregaMetodos().agrega(new GPU("8GB", "GDDR5", "Nvidia", "GTX 1070", 329));
        new AgregaMetodos().agrega(new GPU("6GB", "GDDR5", "Nvidia", "GTX 1060", 299));

        //Crea MoBos
        new AgregaMetodos().agrega(new MoBo("LGA1151", "Asus", "Z270", 150));
        new AgregaMetodos().agrega(new MoBo("LGA1151", "Gigabyte", "B250", 50));
        new AgregaMetodos().agrega(new MoBo("LGA1151", "MSI", "H270", 100));
        new AgregaMetodos().agrega(new MoBo("LGA1151", "Asus", "Z170", 129));

        //Crea RAMs
        new AgregaMetodos().agrega(new RAM("8GB", "DDR4", "3000MHz", "Hyper X", "Fury", 59));
        new AgregaMetodos().agrega(new RAM("16GB", "DDR4", "3200MHz", "Corsair", "Vengeance RGB", 119));
        new AgregaMetodos().agrega(new RAM("32GB", "DDR4", "3400MHz", "G.SKILL", "Ripjaws V RGB", 239));

        //Crea Discos Duros
        new AgregaMetodos().agrega(new HDD("500GB", "5400RPM", "WD", "WD50054", 30));
        new AgregaMetodos().agrega(new HDD("1TB", "7200RPM", "WD", "WD102474", 60));
        new AgregaMetodos().agrega(new HDD("2TB", "7200RPM", "WD", "WD204874", 90));
        new AgregaMetodos().agrega(new HDD("4TB", "1000RPM", "WD", "WD4096100", 130));

        //Crea Fuentes de Poder
        new AgregaMetodos().agrega(new PSU("500W", "Bronce", "EVGA", "500WB", 50));
        new AgregaMetodos().agrega(new PSU("600W", "Bronce", "EVGA", "600WB", 70));
        new AgregaMetodos().agrega(new PSU("750W", "Gold", "Corsair", "750WG", 80));
        new AgregaMetodos().agrega(new PSU("800W", "Platinum", "Seasonic", "800WT", 100));
        
        //Inicia programa
        new MenuPrincipal().setVisible(true);
        
    }

}
