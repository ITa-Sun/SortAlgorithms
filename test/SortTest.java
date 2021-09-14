import org.junit.jupiter.api.Test;

public class SortTest {
    int[] arr = new int[]{1,9,3,4,8,5,7};
    @Test
    public void TestSort(){
       // BubbleSort.doSort(arr);
//        SelectionSort.doSort(arr);
        InsertSort.doSort(arr);
    }
}
