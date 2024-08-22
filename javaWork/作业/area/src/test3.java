public class test3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,6,5,8,3,9,2,19,11};

        int Max = max(arr);
        System.out.println(Max);
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
