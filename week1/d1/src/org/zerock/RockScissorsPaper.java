package org.zerock;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Player user = new Player();
        Player com = new Player();

        int round = 1;

        while (user.getScore() < 3 && com.getScore() < 3) {
            // 현재 라운드, 점수 표시
            System.out.printf("Round: %d\n", round);
            System.out.printf("You %d : %d Computer\n", user.getScore(), com.getScore());

            // 유저 선택
            System.out.print("가위:0 바위:1 보:2 => ");
            int userInput = Integer.parseInt(scanner.nextLine());
            if (userInput < 0 || userInput > 2) {
                System.out.println("Invalid input: you should input 0, 1 or 2\n");
                continue;
            }
            user.setState(userInput);

            // 컴퓨터 선택(랜덤)
            com.setState(random.nextInt(3)); // 0,1,2 중 랜덤 선택

            System.out.println("USER: " + user.getStateName());
            System.out.println("COM: " + com.getStateName());

            /* 승패 판정 */
            int result = user.judge(com);
            switch (result) {
                case 1:
                    user.win();
                    System.out.println("당신이 이겼습니다.\n");
                    break;
                case 0:
                    System.out.println("비겼습니다. 재경기를 시작합니다.\n");
                    continue;
                case -1:
                    com.win();
                    System.out.println("컴퓨터가 이겼습니다.\n");
                    break;
            }

            round++;
        }
        System.out.printf("You %d : %d Computer\n", user.getScore(), com.getScore());
        System.out.printf("%s 먼저 세판을 승리해 최종 승리자가 되었습니다!", user.getScore() > com.getScore() ? "당신이" : "컴퓨터가");
    }
}

class Player {

    private int state;
    private String stateName;
    private int score;

    public int getState() { return state; }

    public String getStateName() { return stateName; }

    public int getScore() { return score; }

    public void win() {
        score++;
    }

    public void setState(int state) {
        this.state = state;
        switch (state) {
            case 0:
                stateName = "가위";
                break;
            case 1:
                stateName = "바위";
                break;
            case 2:
                stateName = "보";
                break;
        }
    }

    public int judge(Player op) {
        int gap = state - op.getState();
        gap = gap < 0 ? gap + 3 : gap;
        return gap == 1 ? 1 : gap == 2 ? -1 : 0;
    }
}