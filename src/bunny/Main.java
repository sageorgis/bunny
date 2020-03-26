/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunny;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Nikos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bunny b1 = new Bunny(10);
        //b1.hop();
        Bunny b2 = new Bunny(14);
        //b2.hop();
        Bunny b3 = new Bunny(20);
        List <Bunny> listOfBunnies = new ArrayList();
        listOfBunnies.add(b1);
        listOfBunnies.add(b2);
        listOfBunnies.add(b3);
        for(int i=0;i<listOfBunnies.size();i++){
            listOfBunnies.get(i).hop();
        }
        System.out.println("---Printing hop of Bunnies with Iterator---");
        Iterator<Bunny> iterator=listOfBunnies.iterator();
        while(iterator.hasNext()){
            iterator.next().hop();
        }
    }
    
}
