public class test {
    public static void main(String[] args){
            System.out.println("面积为" + getArea(1.7,2.4));
            int sum = twoSum(3,8);
            System.out.println(sum);
        };


    public static double getArea(double a,double b){
        double area = a * b;
        return area;
    }

    public static int twoSum(int a,int b){
        int sum = a + b;
        return sum;
    }
}
