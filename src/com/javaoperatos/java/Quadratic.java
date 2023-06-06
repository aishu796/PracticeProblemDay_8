package com.javaoperatos.java;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the value if a:");
        Double a=sc.nextDouble();


        System.out.println("Enter the value if b:");
        Double b=sc.nextDouble();


        System.out.println("Enter the value if c:");
        Double c=sc.nextDouble();


        double d= b*b - 4*a*c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }


    }
}
