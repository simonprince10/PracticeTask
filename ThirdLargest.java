package com.company;

public class ThirdLargest {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 22, 28, 34};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max3 = max2;
                max2 = i;
            } else if (i > max3){
            max3 = i;
        }}
        System.out.println(max3);
            }
}
