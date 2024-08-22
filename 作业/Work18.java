public class Work18{
	public static void main(String[]args){
		int []a=new int[] {1,3,5,7,9,0,2,4,6,8};
		int x=a[0];
		for(int i=0;i<a.length;i++){
			if(x<a[i]){
				x=a[i];
			}
		}	
		System.out.println("MAX="+x);
		for(int i=0;i<a.length;i++){
			if(x>a[i]){
				x=a[i];
			}
		}
		System.out.println("MIN="+x);
	}
}