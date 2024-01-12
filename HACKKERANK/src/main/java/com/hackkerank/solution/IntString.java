package com.hackkerank.solution;

import java.security.Permission;
import java.util.Scanner;

public class IntString {
    public static void main (String[]args){
        DoNotTerminate.forbidExit();
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            String s = Integer.toString(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        }catch(DoNotTerminate.ExitTrappedException e){
            System.out.println("unsuccessful termination");
        }
    }
}
class DoNotTerminate {
    public static class ExitTrappedException extends SecurityException{
        private static final long serialVersionUID = 1;
    }
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager(){
            public void checkPermission(Permission permission){
                if (permission.getName().contains("exitVM")){
                    throw new ExitTrappedException();
                }
            }
        };
    }
}