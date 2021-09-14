public class InsertSort {
    public static void doSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j > 0 && temp<arr[j-1]; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
