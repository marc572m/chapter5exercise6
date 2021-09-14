package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

    double a;
    double b;
    double c;

        System.out.println("Enter A: ");
        a = in.nextDouble();
        System.out.println("Enter B: ");
        b = in.nextDouble();
        System.out.println("Enter C: ");
        c = in.nextDouble();

    double disc = Math.pow(b,2) - 4 * a * c;
        System.out.println("Discriminant: " + disc);

        if (disc < 0){
            System.out.println("No solutions");
        }

        if (disc == 0){
            double x = -b/2*a;
            System.out.println("One solution: x = " + x);
        }
        if (disc > 0){
            double x1 = (-b + Math.sqrt(disc))/(2*a);
            double x2 = (-b - Math.sqrt(disc))/(2*a);
            System.out.println("2 solutions, X1= " + x1 + " X2= " + x2);
            }
        }

    }

