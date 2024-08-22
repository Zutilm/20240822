/*public class WorkThirteen{
	public static void main(String[]args){
		for(int a=1;a<=95;a++){
			for(int b=a+1;b<a+2;b++){
				for(int c=b+1;c<b+2;c++){
					for(int d=c+1;d<c+2;d++){
						for(int f=d+1;f<d+2;f++){
							if((a+b+c+d+f)%6==0){
								System.out.print(a+"+"+b+"+"+c+"+"+d+"+"+f+"可被6整除");
								break;
							}
						}
					}
				}
			}
			System.out.println(" ");
		}
	}
}
*/


/*public class WorkThirteen{
	public static void main(String[]args){
		for(int a=1;a<=1000;a++){
			if(a%6==0){
				System.out.println((a-2)+"+"+(a-1)+"+"+a+"+"+(a+1)+"+"+(a+2)+"可被6整除");
			}
		}
	}
}*/


public class WorkThirteen {
	public static void main(String[]args){
		for (int a=1;a<=1000;a++){
			int sum = 0;
			for(int b=a;b<=a+50;b++){
				sum+=b;
			}
			if( sum%6==0){
			System.out.println(a+"之后50个数相加可被6整除");
			}
		}
	}
}

