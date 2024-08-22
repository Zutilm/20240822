public class Work15{
	public static void main(String[]args){
		int sum=1020;
		int day=1;
		while(sum>0){
			sum -=((sum/2)+2);
			if(sum>0){
				System.out.println("在第"+day+"天后西瓜还剩"+sum);
				day++;
			}else{
				break;
			}
		}
		System.out.println("在第"+day+"天西瓜全卖完");
	}
}