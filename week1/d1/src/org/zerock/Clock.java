package org.zerock;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이 프로그램은 시각(시간, 분)을 입력하면 시침과 분침 사이의 각도(degree)를 계산하는 프로그램 입니다.");

        // 시간, 분 설정 (사용자 입력)
        System.out.print("시간(0~23): ");
        int hour = scanner.nextInt();
        System.out.print("분(0~59): ");
        int minute = scanner.nextInt();

        // 입력 받은 숫자가 유효하지 않은 경우 프로그램 종료
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.out.println("시간은 0~23, 분은 0~59 의 범위 내의 숫자를 입력해주세요.");
            return;
        }

        // 시침과 분침이 12를 기준으로 시계방향으로 몇도 회전했는지 나타내는 변수
        double angMinute = minute * 6.0;
        double angHour = (hour % 12) * 30.0 + minute * 0.5; // hour가 12 이상일 경우 0~11로 변환해서 사용

        // 시침과 분침이 이루는 각도
        double ang = Math.abs(angHour - angMinute);
        if (ang > 180) { ang = Math.abs(ang - 360); } // 예각 표시로 전환

        // 결과 출력
        System.out.printf("%d시%d분에 시침과 분침이 이루는 각도는 %.2f도 입니다.", hour, minute, ang);
    }
}
