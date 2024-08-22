public class Work29one {
    public static void main(String[]args){
        Work29 a=new Work29();
//        a.task1(8,true);
//
//
//        int[] x=new int[]{1,2,3,4};
//        int[] y=new int[]{5,6,7,8};
//        a.task2(x,y);
//        for(int i:x){
//            System.out.print(i);
//        }
//        System.out.println();
//        for(int i:y){
//            System.out.print(i);
//        }
//
//
//        int[] x=new int[]{1,2,3,4,5,6,7,8,9};
//        a.task3(x);
//        for(int i:x){
//            System.out.print(i);
//        }
//
//
//        int[] x=new int[]{1,3,4,5,7,30,6,9,8,2};
//        int result=a.task4(x,true);
//        System.out.println(result);
//
//
//        int[] x=new int[]{1,2,3,4,5,6,7};
//        String result=a.task5(x,8);
//        System.out.println(result);
//
//
//        int[] x=new int[]{1,2,3,5,6,4,9,7,8};
//        int[][] result=a.task6(x);
//        for(int i=0;i<result.length;i++){
//            for(int d:result[i]){
//                System.out.print(d);
//            }
//            System.out.println();
//        }


        int[] x=new int[]{1,3,0,2,4,0,0,8,7,0,5,0,6,9};
        int[] result=a.task7(x,0);
        for(int j=0;j<result.length;j++){
            System.out.print(result[j]);
        }
    }
}