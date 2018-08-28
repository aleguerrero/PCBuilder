/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCBuilder;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro Guerrero A
 */
public class ConteoUso extends Thread {

    static int conteoSegundos = 0;
    static int conteoMinutos = 0;

    public void conteo() {
        while (true) {
            if (conteoSegundos != 60) {
                conteoSegundos++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ConteoUso.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                conteoMinutos++;
                conteoSegundos = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ConteoUso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void run() {
        conteo();
    }
}
