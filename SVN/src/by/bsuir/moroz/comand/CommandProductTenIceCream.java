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
public class CommandProductTenIceCream extends Production implements Command{

    public void execute() {
        int f;
        Production ob = new Production();
        ob.ice();
        ob.rojok();
        f = ob.iceCream();
        System.out.println("Произвели " +f+ " порций мороженного");
    }
}
