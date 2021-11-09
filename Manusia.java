/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPBO;

/**
 *
 * @author LENOVO
 */
public class Manusia {
    
    public void nyalakanPerangkat(Elektronik perangkat){
         perangkat.voltase = 220;
        if (perangkat instanceof TelevisiJadul) {
             System.out.println("Nyalakan televisi jadul dengan input : " + ((TelevisiJadul) perangkat).getModelInput());
             System.out.println("Nyalakan televisi: "+ ((TelevisiJadul) perangkat).voltase);
        } else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi modern dengan input : " + ((TelevisiModern) perangkat).getModelInput());
             System.out.println("Nyalakan televisi: "+ ((TelevisiModern) perangkat).voltase);
        }
    }
}
