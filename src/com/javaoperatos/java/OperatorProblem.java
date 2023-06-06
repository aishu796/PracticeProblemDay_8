package com.javaoperatos.java;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class OperatorProblem {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d;
        System.out.println("maximum value is :"+max(a,b));
        System.out.println("minimum value is :"+min(a,b));
        d=a+b*c;
        System.out.println("Value of d is"+d);


        d=c+a/b;
        System.out.println("Value of d is"+d);

        d=a%b+c;
        System.out.println("Value of d is"+d);

        d=a*b+c;
        System.out.println("Value of d is"+d);
    }
}
