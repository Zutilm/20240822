import java.util.Scanner;

public class StudyEnglish{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数字")；
		int day=input.nextInt();
		if(day==1){
			System.out.println("monday");
		}else if(day==2){
			System.out.println("tueday");
		}else if(day==3){
			System.out.println("wednesday");
		}else if(day==4){
			System.out println("thurday");
		}else if(day==5){
			System.out.println("friday");
		}else if(day==6){
			Syetem.out.println("saturday");
		}else{
			System.out.println("输入数字1~7")；
		}
		
	}
}