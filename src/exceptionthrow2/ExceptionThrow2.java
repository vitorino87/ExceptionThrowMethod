/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionthrow2;

/**
 *
 * @author tiago.lucas
 */
public class ExceptionThrow2 {

    /**
     * @param args the command line arguments
     */
    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside throwOne");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            throwOne();
        }
        catch(IllegalAccessException e){
            System.out.println("Caught "+e);
        }
    }
    
}
