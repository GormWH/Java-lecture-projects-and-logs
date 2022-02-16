package org.zerock;

import java.util.Arrays;

public class ShortestDistance {
    public static void main(String[] args) {
        int[][] arr = { {1, 1}, {5, 5}, {10, 10}, {1, 10}};
        int[] target = {9, 9};

        System.out.printf("Among %d points\n", arr.length);
        double min = Math.hypot(arr[0][0] - target[0], arr[0][1] - target[1]);
        double max = min;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d:%s\n", i + 1, Arrays.toString(arr[i]));
            double distance = Math.hypot(arr[i][0] - target[0], arr[i][1] - target[1]); // hypot(x, y) = sqrt(x^2, y^2)
            if (distance < min) {
                min = distance;
                minIndex = i;
            }
            if (distance > max) {
                max = distance;
                maxIndex = i;
            }
        }
        System.out.printf(">> %d:%s is closest to target %s\n", minIndex+1, Arrays.toString(arr[minIndex]), Arrays.toString(target));
        System.out.printf(">> %d:%s is farthest to target %s\n", maxIndex+1, Arrays.toString(arr[maxIndex]), Arrays.toString(target));
    }
}
