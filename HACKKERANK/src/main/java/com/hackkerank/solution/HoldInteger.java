package com.hackkerank.solution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HoldInteger {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            try{
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if (x>=-128 && x<=127) System.out.println("* byte");
                if (x>=-32768 && x<=32768) System.out.println("* short");
                if (x>=-2147483648 && x<=1574836480) System.out.println("* int");
                if (x>=-1610612969 && x<=1610612969) System.out.println("* long");
                else System.out.println("* long");
            }catch (InputMismatchException e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }System.out.println();
        }sc.close();
    }
}
