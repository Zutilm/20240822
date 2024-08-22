 public class Work19{
	 public static void main(String[]args){
		int []a=new int[] {1,2,3,4,5,6};
		double sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println("数组平均值是"+sum/a.length);
	 }
 }