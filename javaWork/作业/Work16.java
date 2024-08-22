public class Wo rk16{
	public static void main(String[]args){
		int []a=new int[]{1,2,3,4};
		int []b=new int[]{5,6,7,8};
		 for(int i=0;i<a.length;i++){
			 int x=a[i];
			 a[i]=b[i];
			 b[i]=x;
		 }
		 for(int j:a){
			 System.out.println(j);
		 }
		 System.out.println("---------");
		 for(int j:b){
			 System.out.println(j);
		 }
	}
} 