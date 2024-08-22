import java.util.Scanner;

public class WorkOne{
	public static void main(String[]args){
		int num1;
		int num2;
		Scanner input=new Scanner(System.in);
		System.out.println("输入数一");
		num1=input.nextInt();
		System.out.println("输入数二");
		num2=input.nextInt();
		int h=num1+num2;
		System.out.println("和为"+h);
		int c=num1-num2;
		System.out.println("差为"+c);
		int j=num1*num2;
		System.out.println("积为"+j);
		double s=(double)num1/num2;
		System.out.println("商为"+s);
		int y=num1%num2;
		System.out.println("余为"+y);
	}
}