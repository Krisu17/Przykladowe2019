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
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Marcin", "Baranowski", 299234);
        Student student2 = new Student("Krzysztof", "Anderson", 299232);
        student1.setGrade(11, 05, 2019, 1);
        student1.setGrade(12, 05, 2019, 4);
        student1.setGrade(13, 05, 2019, 3);
        student2.setGrade(11, 05, 2019, 100);
        student2.setGrade(12, 05, 2019, 400);
        student2.setGrade(13, 05, 2019, 300);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student1));
        System.out.println(student1.toString());
        System.out.println("Max points = " + student1.maxGrade());
        System.out.println(student2.toString());
        System.out.println("Max points = " + student2.maxGrade());
    }
}
