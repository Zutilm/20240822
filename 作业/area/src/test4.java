public class test4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,2,5,9,7,8,0};
        contains(arr,5);
    }


    public static void contains(int[] arr,int a){
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a){
                b = true;
                break;
            }
        }
        if(b){
            System.out.print(a + "在数组arr中");
        }else{
            System.out.print(a + "不在数组arr中");
        }
    }
}
