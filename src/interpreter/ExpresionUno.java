/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author jvelez
 */
public class ExpresionUno extends Expresion{

    @Override
    public String uno() {
        return "I";
    }

    @Override
    public String cuatro() {
        return "IV";
    }

    @Override
    public String cinco() {
        return "V";
    }

    @Override
    public String nueve() {
        return "IX";
    }

    @Override
    public int multiplicador() {
        return 1;
    }
    
}
