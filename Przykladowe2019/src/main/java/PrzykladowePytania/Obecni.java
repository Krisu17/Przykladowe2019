/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrzykladowePytania;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Krzysztof
 */
public class Obecni implements Iterable<Osoba> {

    private List<Osoba> grupa = new ArrayList<>();

    @Override
    public Iterator<Osoba> iterator() {
        return new Iterator<Osoba>() {
            private int iterator = -1;
            private List<Osoba> copy = grupa;

            @Override
            public boolean hasNext() {
                return iterator < copy.size()-1;
            }
            
            @Override
            public Osoba next() {
               return copy.get(++iterator);
            }
        };
    }
    
    public void dodaj(Osoba os) {
        grupa.add(os);
    }
    
    public void usun(Osoba os) {
        grupa.remove(os);
    }
    
    public int liczbaOsob() {
        return grupa.size();
    }
    
    @Override
    public String toString() {
        StringBuilder wynik = new StringBuilder();
        Iterator<Osoba> iterator = this.iterator();
        while(iterator.hasNext()) {
            wynik.append(iterator.next().toString()).append(" ");
        }
        return wynik.toString();
    }
}
