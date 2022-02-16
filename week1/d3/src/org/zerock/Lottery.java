package org.zerock;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    private int[] numbers = new int[6];

    public Lottery() {
        generateNumbers();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 로또 구매 매수 결정
        System.out.println("로또를 몇장 구매하겠습니까?");
        System.out.print("구매할 금액을 입력해주세요(한장 당 천원)>> ");
        int lotteryAmount = Integer.parseInt(scanner.nextLine()) / 1000;
        Lottery[] lotteries = new Lottery[lotteryAmount];

        for (int i = 0; i < lotteryAmount; i++) {
            lotteries[i] = new Lottery();
            System.out.println(lotteries[i]);
        }
    }

    private void generateNumbers() {
        Random random = new Random();
        outer:
        for (int i = 0; i < 6; i++) {
            int randomNumber = random.nextInt(45) + 1;
            // check for duplicate
            for (int j = 0; j < i; j++) {
                if (numbers[j] == randomNumber) {
                    i--; // 중복일 경우 다음 iteration 으로 넘기지 말것
                    continue outer;
                }
            }
            numbers[i] = randomNumber;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
