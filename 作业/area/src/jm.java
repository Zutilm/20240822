import java.util.Scanner;

public class jm {
    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("请输入");
        //每位数加5
        //在对10取余
        //将数字反转
        int[] arr = new int[]{1,9,8,3};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[arr.length - i -1];
        }
        int[] b = a;
        a = arr;
        arr = b;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
