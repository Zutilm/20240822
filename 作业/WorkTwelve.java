public class WorkTwelve{
	public static void main(String[]args){
		for(int a=2;a<=100;a++){
			boolean x=false;
			for(int b=2;b<=a-1;b++){
				if(a%b==0){
					System.out.println(a+"不是素数");
					x=true;
					break;
				}
			}
			if(x==false){
			System.out.println(a+"是素数的");
			}
		}
	}
}