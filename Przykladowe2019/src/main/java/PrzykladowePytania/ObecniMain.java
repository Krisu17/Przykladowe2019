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
public class ObecniMain {
    public static void main(String[] args) {
        Obecni obecni = new Obecni();
        obecni.dodaj(new Osoba("Marcin", "Baranowski"));
        obecni.dodaj(new Osoba("Marcin", "Baran"));
        obecni.dodaj(new Osoba("Marcin", "Parowa"));
        obecni.dodaj(new Osoba("Marcin", "Frajer"));
        System.out.println(obecni.toString());
    }
}
