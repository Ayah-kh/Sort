public class MergeSort {

    public static void sort(int[] arr){
        int[] aux = new int[arr.length];
        sort(arr,aux,0, arr.length-1);
    }

    public static void sort(int[] arr, int[] aux, int left, int right){
        if (left<=right) return;
            int mid=(left+right)/2;
            sort(arr,aux, left, mid);
            sort(arr,aux, mid+1, right);
            merge(arr,aux, left,mid,right);
    }

    private static void merge(int[] arr,int[] aux, int left, int mid, int right) {
        for (int k = left; k < right; k++) {
            aux[k]=arr[k];
        }

        int i=left;
        int j=mid+1;
        for (int k = left; k <=right; k++) {
            if (i>mid) arr[k]=aux[j++];
            else if (j>right) arr[k]=aux[i++];
            else if (aux[j]<aux[i]) arr[k]=aux[j++];
            else  arr[k]=aux[i++];
        }
    }
}
