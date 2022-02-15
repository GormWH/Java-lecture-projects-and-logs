package org.zerock;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userPoint = 0;
        int comPoint = 0;
        int round = 1;

        while (userPoint < 3 && comPoint < 3) {
            // 현재 라운드, 점수 표시
            System.out.printf("Round: %d\n", round);
            System.out.printf("You %d : %d Computer\n", userPoint, comPoint);

            // 유저 선택
            System.out.print("가위:0 바위:1 보:2 => ");
            int user = Integer.parseInt(scanner.nextLine());
            if (user < 0 || user > 2) {
                System.out.println("Invalid input: you should input 0, 1 or 2\n");
                continue;
            }
            System.out.println("USER: " + Cases.indexToString(user));

            // 컴퓨터 선택(랜덤)
            int com = random.nextInt(3); // 0,1,2 중 랜덤 선택
            System.out.println("COM: " + Cases.indexToString(com));

            /* 승패 판정 */
            if (user < com) { // 일반화 시키기 위해 항상 user >= com 인 상태로 조정
                user = user + 3;
            }
            if (user - com == 1) { // 사용자 승리
                System.out.println("당신이 이겼습니다!\n");
                userPoint++;
            } else if (user - com == 2) { // 컴퓨터 승리
                System.out.println("컴퓨터가 이겼습니다!\n");
                comPoint++;
            } else { // 무승부
                System.out.println("Tie! Rematch!\n");
                continue; // 무승부시 round++ 을 피하기 위해서
            }

            round++;
        }
        System.out.printf("%s 먼저 세판을 승리해 최종 승리자가 되었습니다!", userPoint > comPoint ? "당신이" : "컴퓨터가");
    }
}

enum Cases {
    SCISSORS(0, "가위"),
    ROCK(1, "바위"),
    PAPER(2, "보");

    final int index;
    final String korean;

    Cases(int index, String korean) {
        this.index = index;
        this.korean = korean;
    }

    static String indexToString(int index) {
        for (Cases cases : Cases.values()) {
            if (cases.index % 3 == index) return cases.korean;
        }
        return "Cases.indexToString: given index not found";
    }
}
