public class SelectionSort {
    public static void doSort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int minptr = i;
            //boolean flag = true;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minptr]) {
                    minptr = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minptr];
            arr[minptr] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
