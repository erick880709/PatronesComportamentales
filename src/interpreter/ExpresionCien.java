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
public class ExpresionCien extends Expresion{

    @Override
    public String uno() {
        return "C";
    }

    @Override
    public String cuatro() {
        return "CD";
    }

    @Override
    public String cinco() {
        return "D";
    }

    @Override
    public String nueve() {
        return "CM";
    }

    @Override
    public int multiplicador() {
        return 100;
    }    
}
