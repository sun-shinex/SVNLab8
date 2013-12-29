/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.moroz.comand;

/**
 *
 * @author Irishka
 */
public class CommandProductionHundredIceCream extends Production implements Command{
    
        public void execute() {
        int f=0;
        Production ob = new Production();
        for (int i=0; i<10; i++){
            ob.ice();
            ob.rojok();
            f += ob.iceCream();
        }
        System.out.println("Произвели " +f+ " порций мороженного");
        }
}
