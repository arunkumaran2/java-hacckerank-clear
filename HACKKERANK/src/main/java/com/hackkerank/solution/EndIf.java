package com.hackkerank.solution;

import java.util.Scanner;

public class EndIf {
   public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       int linenumber = 0;
       while (scanner.hasNext()){//(linenumber<=3){//(scanner.hasNext()){
           linenumber++;
           String line = scanner.nextLine();
           System.out.println(linenumber + " " +line);
       }
       scanner.close();
   }
}
