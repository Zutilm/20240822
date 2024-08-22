public class Work22{
	public static void main(String[]args){
		int []a=new int []{1,2,3,0,0,4,5,0,6,0,7};
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i] != 0){
			count++;
			}
		}
		int []b=new int [count];
		int j=0;
		for(int i=0;i<a.length;i++){
			if(a[i] != 0){
				b[j] = a[i];
				j++;
			}else{
				continue;
			}
		}
		for(int x=0;x<b.length;x++){
			System.out.println(b[x]); 
		}
	}
}