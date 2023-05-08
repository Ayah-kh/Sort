import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 5, 23, -1, -6, 14};
        System.out.println("Before " + Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println("After " + Arrays.toString(arr));

        Student Mohammed = new Student(1, "Mohammed");
        Student Ayah = new Student(2, "Ayah");
        Student Ayah2 = new Student(15, "Ayah");
        Student Yaseen = new Student(9, "Yaseen");
        Student Rima = new Student(7, "Rima");

        Student[] students = {Mohammed, Ayah, Ayah2, Yaseen, Rima};
        System.out.println(Arrays.toString(students));
        MergeSort.sort(students);
        System.out.println(Arrays.toString(students));
    }
}