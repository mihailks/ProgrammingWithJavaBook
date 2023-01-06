package OperatorsAndExpressions;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int l = 2*a + 2*b;

        System.out.println("L= " + l);
        System.out.println("S= " + a * b);


    }
}
