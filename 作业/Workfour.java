import java.util.Scanner;

public class WorkFour{
	public static void main(String[]args){
		double num1;
		double num2;
		Scanner input=new Scanner(System.in);
		System.out.println("输入数一");
		num1=input.nextDouble();
		System.out.println("输入数二");
		num2=input.nextDouble();
		double h=num1+num2;
		System.out.println("和为"+h);
		double c=num1-num2;
		System.out.println("差为"+c);
		double j=num1*num2;
		System.out.println("积为"+j);
		double s=num1/num2;
		System.out.println("商为"+s);
		double y=num1%num2;
		System.out.println("余为"+y);
	}
}