package org.zerock;

// 구구단
public class TimesTable {
    public static void main(String[] args) {
        System.out.println("구구단을 외우자");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %2d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
