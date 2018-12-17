package ru.danila_baranov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();

    }

    public static void invertArray(){
        int[] arr= {1,1,0,1,0,0,1,0,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                    arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray() {
        int[] w = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(w));
    }

    public static void  fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
             if (i==j) {
                 arr[i][j]= 1;
             } else {
                 arr[i][j]= 0;
             }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
