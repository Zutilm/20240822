import java.util.Scanner;

public class WorkFiveT{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入成绩");
		int a=input.nextInt();
		switch(a){
			case 0:
				System.out.println("不及的小名");
			case 59:
				System.out.println("及格ggg");
				break;
			case 60:
				System.out.println("及格");
			case 69:
				System.out.println("及格");
				break;
			default:
				System.out.println("error");
		}
	}
	
}