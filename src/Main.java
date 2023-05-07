import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {25, 33, 2, 5, 46, 13, 22};
        System.out.println("Before " + Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println("After " + Arrays.toString(arr));

    }
}