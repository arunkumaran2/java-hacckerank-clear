package com.hackkerank.solution;

import java.util.Scanner;

public class IntegerProblem {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            for (int k = 0; k<n ; k++){
                result += (int) (Math.pow(2, k)*b);
                System.out.println(result + " ");
            }
System.out.println();
        }in.close();
    }
}
