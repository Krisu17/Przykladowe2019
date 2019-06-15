/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrzykladowePytania;

/**
 *
 * @author Krzysztof
 */
public class PersistentCounter extends Thread {
    private long deley = 200;
    private volatile long counter = 0;
    
    @Override
    public void run() {
       while(true) {
           try {
               counter++;
               sleep(deley);
           } catch (InterruptedException e) {
               counter = 0;
           }
       } 
    }
    
    public long getCounter() {
        return counter;
    }
}
