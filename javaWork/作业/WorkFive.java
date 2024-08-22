import java.util.Scanner;

public class WorkFive{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入成绩");
		int a=input.nextInt();
		switch(a/10){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("bjg");
				break;
			case 6:
				System.out.println("及格");
				break;
			case 7:
				System.out.println("中等");
				break;
			case 8:
				System.out.println("良好");
				break;
			case 9:
				System.out.println("优秀");
				break;
			case 10:
				if(a==100){
				System.out.println("完美");
				break;}
			default:
				System.out.println("error");
		}
	}
	
}