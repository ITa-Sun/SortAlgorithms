import java.util.Arrays;

public class MergeSort {
    public static void doSort(int[] arr) {
        int middle = arr.length / 2;
        int[] result = mergeSort(arr, middle);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] mergeSort(int[] arr, int middle) {
        if (arr.length > 1) {
            int[] arr1 = Arrays.copyOfRange(arr, 0, middle);
            int[] arr2 = Arrays.copyOfRange(arr, middle, arr.length);
            int middle1 = arr1.length / 2;
            int middle2 = arr2.length / 2;
            int[] temp1 = mergeSort(arr1, middle1);
            int[] temp2 = mergeSort(arr2, middle2);
            return merge(temp1, temp2);
        }
        return arr;
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int ptrResult = 0;
        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < arr1.length && ptr2 < arr2.length) {
            if (arr1[ptr1] < arr2[ptr2]) {
                result[ptrResult] = arr1[ptr1];
                ptr1++;
            } else {
                result[ptrResult] = arr2[ptr2];
                ptr2++;
            }
            ptrResult++;
        }
        if (ptr1 == arr1.length){
            while (ptrResult<result.length){
                result[ptrResult] = arr2[ptr2];
                ptr2++;
                ptrResult++;
            }
        }
        if (ptr2 == arr2.length){
            while (ptrResult<result.length){
                result[ptrResult] = arr1[ptr1];
                ptr1++;
                ptrResult++;
            }
        }
        return result;
    }
}
