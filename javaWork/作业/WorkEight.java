public class WorkEight{
	public static void main(String[]args){
		for(int a=1;a<=4;a++){
			for(int b=a+1;b<=4;b++){
				System.out.print("$");
			}
			for(int c=5-a;c<=4;c++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}