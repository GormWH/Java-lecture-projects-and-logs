package org.zerock;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        // 1~45 중 6개가 일치해야 당첨

        int[] myPick = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            myPick[i] = random.nextInt(45) + 1;
            // check for duplicate
            for (int j = 0; j < i; j++) {
                if (myPick[j] == myPick[i]) {
                    i--;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(myPick));
    }
}
