import java.util.Scanner;

public class WorkThree{
		public static void main(String[]args){
			int num1;
			int num2;
			Scanner input=new Scanner(System.in);
			System.out.println("输入数一");
			num1=input.nextInt();
			System.out.println("输入数二");
			num2=input.nextInt();
			if(num1<num2){
				System.out.println("数一小于数二");
			}else if(num1==num2){
				System.out.println("数一等于数二");
			}else if(num1>num2){
				System.out.println("数一大于数二");
			}
		}
}