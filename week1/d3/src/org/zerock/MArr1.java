package org.zerock;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MArr1 {
    public static void main(String[] args) {
        int[][] arr = { {1, 1}, {5, 5}, {10, 10}, {1, 10}};

        for (int[] tempArr: arr) {
            System.out.println(Arrays.toString(tempArr));
        }
    }
}
