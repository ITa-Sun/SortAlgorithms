public class QuickSort {
    public static void doSort(int[] arr) {
        int[] a = qSort(arr, 0, arr.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static int[] qSort(int[] arr, int low, int high) {
        if (low < high) {
            int parti = partition(arr, low, high);
            qSort(arr, low, parti - 1);
            qSort(arr, parti + 1, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = low;
        int left = low;
        int right = high;
        while (left < right) {

            while (arr[left] < arr[pivot]) {
                left++;
            }
            while (arr[right] > arr[pivot]) {
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int temp = arr[pivot];
        arr[pivot] = arr[left];
        arr[left] = temp;
        return left;
    }
}
