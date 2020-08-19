package myTest;

public class ArrayCopy1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] result = new int[5];


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.arraycopy(arr,3, arr, 3-1, 5-3);

        System.out.println("");
        System.out.println("####################################################");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
