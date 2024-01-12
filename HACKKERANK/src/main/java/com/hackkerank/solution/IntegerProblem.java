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
            generateSeries(a, b, n);
           /* int result = a;
            for (int k = 0; k<n ; k++){
                result += (int) (Math.pow(2, k)*b);
                System.out.println(result + " ");*/
            }in.close();
        }
        private static void generateSeries(int a, int b, int n) {
        int result;
        for (int j = 0; j < n; j++) {
            result = a;
            for (int k = 0; k <= j; k++) {
                result +=  (Math.pow(2, k) * b);
            }
            System.out.print(result + " ");

        }System.out.println();
    }
}
