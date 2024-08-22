import java.util.Scanner;

public class WorkTwo{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入数字");
		int number=input.nextInt();
		if(number<=3){
			System.out.println("幼儿");
		}else if(4<=number&number<=14){
			System.out.println("少年");
		}else if(14<number&number<=18){
			System.out.println("青年");
		}else if(18<number&number<=30){
			System.out.println("成年");
		}else if(30<number&number<=45){
			System.out.println("中年");
		}else{
			System.out.println("重新输入");
		}
	}
}