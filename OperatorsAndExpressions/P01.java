package OperatorsAndExpressions;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n%2==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
