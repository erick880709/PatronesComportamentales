/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresp;

/**
 *
 * @author jvelez
 */
public class Director implements IAprobador{
    IAprobador siguiente;
    @Override
    public void setSiguiente(IAprobador aprobador) {
        //siguiente=aprobador;
    }

    @Override
    public IAprobador getSiguiente() {
        return siguiente;
    }

    @Override
    public void solicitarPrestamo(int cantidad) {
        if(cantidad>100000){
            System.out.println("Lo manejo YO el Director");
        }
    }
}
