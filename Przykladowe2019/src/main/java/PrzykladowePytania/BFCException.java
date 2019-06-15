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
public class BFCException extends Exception {
    private final int NONUMBER = 1;
    
    private String path;
    private int row;
    private int errCode;
    
    public BFCException (String path, int row, int errCode, String message) {
        super(message);
        this.path = path;
        this.row = row;
        this.errCode = errCode;
    }
    
    public String getPath () {
        return this.path;
    }
    
    public int getRow () {
        return this.row;
    }
    
}
