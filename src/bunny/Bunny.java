/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunny;

/**
 *
 * @author Nikos
 */
public class Bunny {
    private int bunnyNumber;
    
    public Bunny(int bunnyNumber){
        this.bunnyNumber=bunnyNumber;
    }

    public int getBunnyNumber() {
        return bunnyNumber;
    }
    
    public void hop(){
        System.out.println("I'm hoping and my number is "+ getBunnyNumber());
    }

    @Override
    public String toString() {
        return "Bunny{" + "bunnyNumber= " + bunnyNumber + '}';
    }
    
}