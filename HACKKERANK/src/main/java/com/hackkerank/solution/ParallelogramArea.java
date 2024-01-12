package com.hackkerank.solution;

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        boolean flag = (B > 0 && H > 0);

        if (flag) {
            int area = B * H;
            System.out.print(area);
        } else {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }

        scanner.close();
    }
}
