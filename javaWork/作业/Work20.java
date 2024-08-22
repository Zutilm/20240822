/*public class Work20{
	public static void main(String[]args){
		int []a=new int[] {1,2,3};
		int []b=new int[] {4,5};
		int []c=new int[5];
		for(int i=0;i<(c.length-b.length);i++){
			c[i]=a[i];
		}
		for(int j=a.length;j<c.length;j++){
			c[j]=b[j-a.length];
		}
		for(int x=0;x<c.length;x++){
		System.out.println(c[x]);
		}
	}
}*/

public class Work20{
	public static void main(String[]args){
		int[] a=new int[]{1,2,3,};
		int[] b=new int[]{4,5};
		int[] c=new int[5];
		for(int i=0;i<c.length;i++){
			if(i<a.length){
				c[i]=a[i];
			}else {
				c[i]=b[i-a.length];
			}
		}
		for(int j=0;j<c.length;j++){
			System.out.println(c[j]);
		}
	}
}