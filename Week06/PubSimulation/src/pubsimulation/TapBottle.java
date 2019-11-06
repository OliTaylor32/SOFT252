/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;

/**
 *
 * @author otaylor4
 */
public class TapBottle {
    public void serve(String drink){
        if (drink == "pint") {
            System.out.println("put glass under tap");
        }
        if (drink == "bottle") {
            System.out.println("Open bottle");
        }
        
        System.out.println("Pour drink into glass");
    }
}
