import java.util.Scanner;

public class WorkTen{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入行数");
		int line=input.nextInt();
		for(int a=1;a<=line;a++){
			if(a<=1){
				for(int i=a;i<=2*line-1;i++){
					System.out.print("*");
				}
				System.out.println();
			}
			else{
				for(int b=1;b<=(line+1)-a;b++){
					System.out.print("*");
				}
				for(int c=1;c<=2*a-3;c++){
					System.out.print(" ");
				}
				for(int d=1;d<=(line+1)-a;d++){
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}
	}
}