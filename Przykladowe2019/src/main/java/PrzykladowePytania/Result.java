
package PrzykladowePytania;
import java.util.*;

public class Result implements Comparable<Result> {
    private String id;
    private int first;
    private double second;
    
    public String getId() {
        return id;
    }
    
    public int getFirst() {
        return first;
    }
    
    public double getSecond() {
        return second;
    }
    
    public Result (String id, int first, double second) {
        this.id = id;
        this.first = first;
        this.second = second;
    }
    
    @Override
    public int compareTo(Result other) {
        int r = this.id.compareTo(other.id);
        return r;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;
        if(!(o instanceof Result))
            return false;
        Result other = (Result) o;
        if(other.id == this.id) 
            return true;
        else
            return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return this.id + this.first + this.second;
    }
    
    
}
