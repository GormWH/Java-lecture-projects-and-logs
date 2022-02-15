package org.zerock;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user = Integer.parseInt(scanner.nextLine());

        System.out.println("USER: " + user);

        Random random = new Random();

        int com = random.nextInt(3);

        System.out.println("COM: " + com);
    }
}
