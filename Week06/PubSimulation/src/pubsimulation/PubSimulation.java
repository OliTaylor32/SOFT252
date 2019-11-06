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
public class PubSimulation {
    private DrinkStrategy strategy;
    public String drink;
    
    public void DrinkServer(DrinkStrategy newStrategy){
        strategy = newStrategy;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void serveDrink(){
        String returnDrink = strategy.serve(drink);
    }
    
}

