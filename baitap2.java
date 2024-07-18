import java.util.Arrays;
public class baitap2 {
    public static void main(String[] args) {
        int[] Arr = {10,4,6,7,8,0,0,0,0};
        int[] newArr=new int[Arr.length+1];
        int valuePush =5 ;
        int indexPush = 3;
        System.out.println("Trước khi thêm" + Arrays.toString(Arr));
        for(int i=0;i<indexPush;i++){
       if(i<indexPush){
           newArr[i]=Arr[i];
       }else if(i ==indexPush){
           newArr[i]=valuePush;
       }else {
           newArr[i]=Arr[i-1];
       }
        }
        System.out.println("Sau khi thêm: " +Arrays.toString(newArr));

    }
}
