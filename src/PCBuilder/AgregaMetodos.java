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
public class AgregaMetodos implements metodos{

    @Override
    public void agrega(CPU c) {
       CPU.cpus.add(c);
    }

    @Override
    public void agrega(GPU g) {
        GPU.gpus.add(g);
    }

    @Override
    public void agrega(PSU p) {
        PSU.psus.add(p);
    }

    @Override
    public void agrega(RAM r) {
        RAM.rams.add(r);
    }

    @Override
    public void agrega(HDD h) {
        HDD.hdds.add(h);
    }

    @Override
    public void agrega(MoBo m) {
        MoBo.mobos.add(m);
    }
    
}
