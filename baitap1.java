import java.util.Scanner;
public class baitap1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int a = Integer.parseInt(sc.nextLine());
        int[] numberArr = new int[a];
        System.out.println("Nhập giá trị các phần tử của mảng: ");
        for(int i=0;i<numberArr.length;i++){
            System.out.printf("numberArr[%d]=",i);
            numberArr[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Giá trị các phần tử trong mảng trước khi xoá: ");
        for(int i=0;i<numberArr.length;i++){
            System.out.printf("%d\t",numberArr[i]);
        }
        System.out.println("\n");
        System.out.println("Nhập vào giá trị cần xoá trong mảng: ");
        int deleteNumber =Integer.parseInt(sc.nextLine());
        int cnt=0;
        for (int i=0;i<numberArr.length;i++){
            if (numberArr[i]==deleteNumber){
                cnt++;
    
            }
        }
        int[]newArr = new int[numberArr.length-cnt];
        int index=0;
        for(int i=0;i<numberArr.length;i++){
            if (numberArr[i]==deleteNumber){
                continue;
            }else{
                newArr[index]=numberArr[i];
                index++;
            }
        }
        System.out.println("Giá trị các phần tử trong mảng sau khi xoá");
        for(int i=0;i<newArr.length;i++){
            System.out.printf("%d\t",newArr[i]);
            System.err.printf("\n");
        }
    }
}
//cách 2
// import java.util.Arrays;
// public class Main {
//     public static void main(String[] args) {
//         int[] Arr = {10,4,6,7,8,6,0,0,0};
//         int valueDelete =7 ;
//         int indexDelete = -1;
//         for(int i=0;i<Arr.length;i++) {
//             if(Arr[i]==valueDelete) {
//                 indexDelete=i;
//                 break;
//             }
//         }
//         System.out.println("Trước khi xoá" + Arrays.toString(Arr));
//         for(int i=indexDelete;i<Arr.length-1;i++) {
//             Arr[i]=Arr[i+1];

//         }
//         Arr[Arr.length-1]=0;
//         System.out.println("Sau khi xoa" +Arrays.toString(Arr));

//     }
// }