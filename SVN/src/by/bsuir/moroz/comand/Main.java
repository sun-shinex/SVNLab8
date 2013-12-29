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
public class Main {
    public static void main(String []args){
        Command com = new CommandProductTenIceCream();
        com.execute();
        com = new CommandProductionHundredIceCream();
        com.execute();
    }
}
