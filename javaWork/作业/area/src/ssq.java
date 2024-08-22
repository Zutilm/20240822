import java.util.Random;

public class ssq {
    public static void main(String[] args) {
        int[] newArr = createNumber();

        for (int i = 0; i < newArr.length - 1; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println("+" + " " + newArr[newArr.length-1]);

    }

    public static int[] createNumber (){
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr,redNumber);
            if(!flag){
                arr[i] = redNumber;
                i++;
            }
        }

        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;

        return arr;
    }

    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(number == arr[i]){
                return  true;
            }
        }
        return false;
    }
}
