public class Work21{
	public static void main(String[]args){
		int []a=new int[]{1,2,3,9,4,5};
		int MAX=a[0];
		int index=0;
		for(int x=0;x<a.length;x++){
			if(a[x]>MAX){
				MAX=a[x];
				index=x;
			}
		}
		int []b=new int[index];
		int []c=new int[a.length-index-1];
		for(int i=0;i<a.length;i++){
			if(i<b.length){
				b[i]=a[i];
			}else if(i==b.length){
				continue;
			}else if(i>b.length){
				c[i-b.length-1]=a[i];
			}
		}
		for(int j=0;j<a.length;j++){
			if(j<b.length){
				System.out.println(b[j]);
			}else if(j==b.length){
				System.out.println("-------------");
			}else if(j>b.length){ 
				System.out.println(c[j-b.length-1]);
			}
		}
	}
}