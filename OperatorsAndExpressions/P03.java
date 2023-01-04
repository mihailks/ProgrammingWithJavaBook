package OperatorsAndExpressions;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n%100==7){
            System.out.println("Yes");
        }
    }
}
