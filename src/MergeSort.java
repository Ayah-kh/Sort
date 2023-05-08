public class MergeSort {

    public static void sort(Comparable[] arr) {
        Comparable[] aux = new Comparable[arr.length];
        sort(arr, aux, 0, arr.length - 1);
    }

    private static void sort(Comparable[] arr, Comparable[] aux, int left, int right) {
        if (right <= left) return;
        int mid = left + (right - left) / 2;
        sort(arr, aux, left, mid);
        sort(arr, aux, mid + 1, right);
        merge(arr, aux, left, mid, right);
    }

    private static void merge(Comparable[] arr, Comparable[] aux, int left, int mid, int right) {
        for (int k = left; k <= right; k++) {
            aux[k] = arr[k];
        }

        int i = left;
        int j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i > mid)
                arr[k] = aux[j++];
            else if (j > right)
                arr[k] = aux[i++];
            else if (aux[i].compareTo(aux[j]) <= 0)
            arr[k] = aux[i++];
            else
            arr[k] = aux[j++];
        }
    }
}
