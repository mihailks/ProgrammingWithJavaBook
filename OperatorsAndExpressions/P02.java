package OperatorsAndExpressions;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isEven = false;
        if (n%2==0){
            isEven=true;
        }
        if (isEven){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

