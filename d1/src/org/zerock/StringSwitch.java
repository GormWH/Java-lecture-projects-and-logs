package org.zerock;

import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 혈액형은?: ");
        String bloodType = scanner.nextLine();

        switch (bloodType) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "O":
                System.out.println("O");
                break;
            case "AB":
                System.out.println("AB");
                break;
        }

    }
}
