package OperatorsAndExpressions;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isEven = false;
        if (n%5==0 || n%7==0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

