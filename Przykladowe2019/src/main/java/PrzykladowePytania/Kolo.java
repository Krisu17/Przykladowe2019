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
public class Kolo implements FiguraStan {

    @Override
    public double obwod(double wielkosc) {
        return 2 * Math.PI * wielkosc;
    }

}
