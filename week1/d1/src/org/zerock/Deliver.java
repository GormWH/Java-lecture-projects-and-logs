package org.zerock;

import java.util.Scanner;

public class Deliver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("택배 무게(g;gram): ");
        int weight = scanner.nextInt();
        System.out.print("배송 목적지 구분(1:동일권, 2:타권, 3:제주권): ");
        int deliverZone = scanner.nextInt();

        // 동일권, 타권, 제주권에서의 가격표.
        int[] pricesSameRegion = {
                2900, 3100, 3200, 3400, 3600,3700, 3800
                , 3900, 4000, 4300, 4600, 4900, 5000
                , 5400, 6500, 7000, 7800, 8800, 10000
        };
        int[] pricesDifferentRegion = {
                3400, 3600, 3700, 3900, 4100, 4200, 4300,
                4400, 4500, 4800, 5100, 5400, 5500, 5900,
                7500, 8000, 8800, 9800, 11000
        };
        int[] pricesJejuRegion = {
                6100, 6300, 6400, 6600, 7100, 7200, 7300,
                7400, 7500, 7800, 8100, 8400, 8500, 8900,
                10500, 10500, 11800, 11800, 13000
        };

        // 가격을 구분 무게 일람(g;gram)
        int[] weights = {
                0, 350, 400, 450, 500, 600, 700,
                800, 900, 1000, 1500, 2000, 3000, 4000,
                5000, 7000, 10000, 15000, 20000
        };

        int weightIndex = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weight < weights[i]) {
                break;
            }
            weightIndex = i;
        }

        int price = 0;
        String region = "";
        switch (deliverZone) {
            case 1:
                price = pricesSameRegion[weightIndex];
                region = "동일권";
                break;
            case 2:
                price = pricesDifferentRegion[weightIndex];
                region = "타권";
                break;
            case 3:
                price = pricesJejuRegion[weightIndex];
                region = "제주권";
                break;
        }
        System.out.printf("%dg의 택배를 %s으로 보내는 비용은 %d원 입니다.",weight, region, price);
    }
}
