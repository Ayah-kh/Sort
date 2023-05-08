import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,5,23,-1,-6,14};
        System.out.println("Before " + Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println("After " + Arrays.toString(arr));

    }
}