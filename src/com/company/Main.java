package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number ");
        int n = scanner.nextInt();
        System.out.println(returnRequiredNumber(n));
    }

    private static boolean isRequiredNumber(int k) {
        String digits = String.valueOf(k);
        int counter = 0;
        char strong = compareSymbolsStrong(digits.charAt(0), digits.charAt(1), digits.charAt(2));
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == strong) {
                counter++;
            }
        }
        return counter == digits.length() - 1;
    }

    private static Character compareSymbolsStrong(Character symbol1, Character symbol2, Character symbol3) {
        if (symbol1 == symbol2) {
            return symbol1;
        }
        if (symbol1 == symbol3) {
            return symbol1;
        }
        if (symbol2 == symbol3) {
            return symbol2;
        }
        return null;
    }

    private static int returnRequiredNumber(int n) {
        int counter = 0;
        for (int i = 100; i <= 999; i++) {
            if (isRequiredNumber(i)) {
                counter++;
                if (counter == n) {
                    return i;
                }
            }
        }
        return 0;
    }
}
