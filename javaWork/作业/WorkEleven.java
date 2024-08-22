/*public class WorkEleven{
	public static void main(String[]args){
		for(int a=1;a<=4;a++){
			int i=1;
			for(int b=a+1;b<=4;b++){
				System.out.print(" ");
			}
			for(int c=5-a;c<=4;c++){
				System.out.print(i++);
			}
			for(int d=5-a;d<=3;d++){
				System.out.print(i---2);
			}
			System.out.println(" ");
		}
	}
}
*/
public class WorkEleven{
	public static void main(String[]args){
		for(int a=1;a<=4;a++){
			for(int b=1;b<=4-a;b++){
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++){
				System.out.print(c);
			}
			for(int d=a-1;d>=1;d--){
				System.out.print(d);
			}
			System.out.println(" ");
		}
	}
}