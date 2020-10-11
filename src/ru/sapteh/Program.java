package ru.sapteh;


public class Program {
    public static void main(String[] args) {
        int[][] arr1 = new int[6][7];

        arraySort(arr1);
        arr(arr1);
    }


    public static void arraySort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += Math.random() * 9;
            }
        }

        int maxValue = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (maxValue < arr[i][j]){
                        maxValue = arr[i][j];
                        arr[i][j] = maxValue;
                    }
                }
                arr[i][0] = maxValue;
            }
    }

    public static void arr(int[][]  arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
            }
        }
    }



