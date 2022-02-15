package org.zerock;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이 프로그램은 시각(시간, 분)을 입력하면 시침과 분침 사이의 각도(degree)를 계산하는 프로그램 입니다.");

        System.out.print("시간(0~23): ");
        int hour = scanner.nextInt();
        System.out.print("분(0~59): ");
        int minute = scanner.nextInt();

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            // 입력 받은 숫자가 유효하지 않은 경우
            // 유효 숫자 입력 방법 출력 후 종료
            System.out.println("시간은 0~23, 분은 0~59 의 범위 내의 숫자를 입력해주세요.");
        } else {
            // 시침과 분침이 12를 기준으로 시계방향으로 몇도 회전했는지 나타내는 변수
            double angMinute = minute * 6.0;
            double angHour = hour * 30.0 + minute * 0.5;
            if (angHour > 360) {
                // 만약 12~23시를 입력 받아 360도 이상의 값이 되었을 경우 360도 이하의 값으로 수정
                angHour = angHour - 360;
            }
            // 시침과 분침이 이루는 각도
            double ang = Math.abs(angHour - angMinute);
            if (ang > 180) { ang = Math.abs(ang - 360); } // 예각 표시로 전환
            // 결과 출력
            System.out.printf("%d시%d분에 시침과 분침이 이루는 각도는 %.2f도 입니다.", hour, minute, ang);
        }
    }
}
