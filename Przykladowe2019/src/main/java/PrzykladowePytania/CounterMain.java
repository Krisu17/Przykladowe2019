/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrzykladowePytania;

import static java.lang.Thread.sleep;

/**
 *
 * @author Krzysztof
 */
public class CounterMain {
    public static void main(String[] args) throws InterruptedException {
        PersistentCounter counter = new PersistentCounter();
        counter.start();
        System.out.println(counter.getCounter());
        sleep(1000);
        System.out.println(counter.getCounter());
        sleep(1000);
        System.out.println(counter.getCounter());
        sleep(1000);
        System.out.println(counter.getCounter());
        sleep(1000);
        System.out.println(counter.getCounter());
        counter.interrupt();
        sleep(10);
        System.out.println("Interrupted!" + counter.getCounter());
        sleep(1000);
        System.out.println(counter.getCounter());
        sleep(1000);
        System.out.println(counter.getCounter());
        sleep(1000);
        System.out.println(counter.getCounter());
        sleep(1000);
        System.out.println(counter.getCounter());
        System.exit(0);
    }
}
