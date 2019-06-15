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
import java.util.Objects;

public class Figura {

    private final String nazwa;
    private final double wielkosc;
    private FiguraStan figura;

    public Figura(String nazwa, double wielkosc, FiguraStan figura) {
        this.nazwa = nazwa;
        this.wielkosc = wielkosc;
        this.figura = figura;
    }

    public double obwod() {
        return this.figura.obwod(wielkosc);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Figura &&
                ((Figura) o).nazwa.equals(nazwa) &&
                ((Figura) o).figura == figura &&
                ((Figura) o).wielkosc == wielkosc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, wielkosc, figura);
    }

  }
