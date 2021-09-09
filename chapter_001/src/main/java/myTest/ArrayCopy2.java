package mytest;

import java.util.Arrays;
import java.util.Objects;

public class ArrayCopy2 {


    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = new int[arr.length + 1];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        arr = Arrays.copyOf(arr2, arr2.length);

       arr[5] = 6;

        System.out.println("");
        System.out.println("####################################################");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        if (Objects.checkIndex(1, 2) == 1) {
            System.out.println("err");
        }
    }

}
