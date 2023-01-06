package OperatorsAndExpressions;

import java.util.Scanner;

public class P04 {
    static class GFG {
        public static long printKthBit(long n, long k) {
            long result = ((n >> (k - 1)) % 2);
            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long n = Long.parseLong(scanner.nextLine());
            int k = 3;

            long result = printKthBit(n, k);
            if (result==1){
                System.out.println("Yes, it is 1");
            } else {
                System.out.println("No, it is 0");
            }
        }
    }
}