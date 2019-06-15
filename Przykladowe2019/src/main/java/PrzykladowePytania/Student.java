/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrzykladowePytania;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Krzysztof
 */
public class Student {
    private String first;
    private String sure;
    private int index;
    private Map<data,Integer> grades = new HashMap<>();

    private class data {
        int day;
        int month;
        int year;
        
        public data(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
            
        }
    }
    
    public Student(String first, String sure, int index) {
        this.first = first;
        this.sure = sure;
        this.index = index;
    }
    
    public void setGrade(int day, int month, int year, int points) {
        data date = new data(day, month, year);
        grades.put(date, points);
    }
    
    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;
        if(!(o instanceof Student))
            return false;
        Student other = (Student) o;
        if(other.index == this.index)
            return true;
        else
            return false;
    }
    
    @Override
    public int hashCode() {
        return 17*index;
    }
    
    @Override
    public String toString() {
        return this.first + ' ' + this.sure + ' ' + Integer.toString(this.index);
    }
    
    public int maxGrade() {
        int max = 0;
        for(int points : grades.values())
            if(points > max)
                max = points;
        return max;
    }
}
