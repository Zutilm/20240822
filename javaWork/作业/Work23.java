public class Work23{
	public static void main(String[]args){
		int[] b=new int[25];
		int count=0;
		for(int i=2;i<=100;i++){
			boolean x=false;
			for(int j=2;j<=i-1;j++){
				if(i%j==0){
					x=true;
					break;  
				}
			}
			if(x==false){
				b[count]=i;
				count++;
			}
		}
		for(int j=0;j<b.length;j++){
			System.out.println(b[j]);
		}
	}
} 