package OperatorsAndExpressions;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        n/=10;
        n/=10;
        if (n%10==7){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
