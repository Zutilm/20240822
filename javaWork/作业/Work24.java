public class Work24{
	public static void main(String[]args){
		int[] a=new int[]{5,2,3,1,4};
		for (int i=(a.length-1);i>=0;i--){
			for (int j=(a.length-1);j>=1;j--){
				if (a[j]>a[j-1]){
					int x=a[j];
					a[j]=a[j-1];
					a[j-1]=x;
				}
			}
		}
		for (int d=0;d<a.length;d++){
			System.out.println(a[d]);
		}
	}
}