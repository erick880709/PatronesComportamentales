/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author jvelez
 */
public class ComandoMoverArriba implements Command{

    private LuzReceiver luz;

    public ComandoMoverArriba(LuzReceiver luz) {
        this.luz = luz;
    }
    
    @Override
    public void execute() {
        luz.encender();
    }
    
}
