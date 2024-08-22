import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        //1.建一个数组储存分数
        int[] scoreArr = getScore();
//        for(int i = 0; i < scoreArr.length; i++){
//            System.out.println(scoreArr[i]);
//        }
        //2.算出最大值
        int max = getMax(scoreArr);
        //3.算出最小值
        int min = getMin(scoreArr);
        //4.求六个数的总和
        int sum = getSum(scoreArr);
        //5.(总分-最大值-最小值)/4
        int sumAll = (sum - max - min) / (scoreArr.length-2);
        //6.打印结果
        System.out.println("选手得分为" + sumAll);
    }

    public static int[] getScore(){
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入评委分数");
            int sco = sc.nextInt();
            if(sco >= 0 && sco <= 100){
                scores[i] = sco;
                i++;
            }
        }
        return scores;
    }

    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(max < scoreArr[i]){
             max = scoreArr[i];
            }
        }

        return max;
    }

    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(min > scoreArr[i]){
                min = scoreArr[i];
            }
        }

        return min;
    }

    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }
}