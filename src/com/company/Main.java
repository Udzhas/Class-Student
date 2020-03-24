package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student AA= new Student();
        Student Pas = new Student("Panas", 4.0);
        Student Bobryi = new Student("Bobryi", 4.3);
        Student Udzhas = new Student("Udzhas", 4.9);
        System.out.println(AA.toString());
        System.out.println(Pas.toString());
        System.out.println(Bobryi.toString());
        System.out.println(Udzhas.toString());
        changeName(Udzhas);
        System.out.println("Udzhas -> "+Udzhas.getName());
    }
    private static void changeName(Student A) {
        A.setName("Yuriy");
    }
}
 class Student {
     private String name;
     private double rating;

     Student() {
         this.name = "Noname";
         this.rating = 0;
     }

     Student(String name, double rating) {
         this.name = name;
         this.rating = rating;
     }

     public String toString() {
         return "Student: " + name + "\nRating= " + rating;
     }

     void setName(String name) {
         this.name = name;
     }

     String getName() {
         return name;
     }

     public void setRating(double rating) {
         this.rating = rating;
     }

     public double getRating() {
         return rating;
     }
 }
