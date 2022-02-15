package org.zerock;

public class Cuboid {
    public static void main(String[] args) {
        System.out.println("이 프로그램은 직육면체의 가로, 세로, 높이(cm)와 면적(m^2)당 가격(원)에 따라 직육면체의 가격을 계산하는 프로그램 입니다.");

        // 직육면체의 가로, 세로, 높이(cm)
        int x = 10; // 가로 = 10cm
        int y = 20; // 세로 = 20cm
        int z = 7;  // 높이 = 7cm

        // 면적(m^2) 당 가겨(원)
        int pricePerSquareMeter = 1000; // 면적당가격 = 1000원/1m^2

        // 총 면적(6면의 면적합)
        double area = 2 * (x * y + y * z + z * x) / 10000.0; // 10000.0으로 나누기(cm^2 -> m^2)

        System.out.printf("(가로, 세로, 높이) = (%d, %d, %d)인 직육면체의 표면적은 %fm^2\n", x, y, z, area);
        System.out.printf("면적당 가격은 %d원/m^2 이므로\n", pricePerSquareMeter);
        System.out.printf("이 직육면체는 <<%f원>> 입니다.", area * pricePerSquareMeter);
    }
}
