import java.util.Scanner;
public class baitap3 {
    public static void main(String[] args) {
        int[] Arr1 = {1, 2, 3, 4, 5};
        int[] Arr2 = {6, 7, 8};
        int[] Arr3 = new int[Arr1.length + Arr2.length];
        int indexcur = 0;
        for (int i = 0; i < Arr1.length; i++) {
            Arr3[indexcur] = Arr1[i];
            indexcur++;
        }
        for (int j = 0; j < Arr2.length; j++) {
            Arr3[indexcur] = Arr2[j];
            indexcur++;
        }
        System.out.println("Mảng được ghép là: " +Arrays.toString(Arr3));
    }
}