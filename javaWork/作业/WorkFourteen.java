public class WorkFourteen{
	public static void main(String[]args){
		int sum =1000;
		int hour=0;
		while(sum >0){
			sum -=7;
			sum -=18;
			System.out.println  ("过了"+hour+"小时"+"小茗和哥哥还相距"+sum);
			hour ++;
		}
		System.out.println("过了"+hour+"小时"+"小茗和哥哥相遇了");
	}
}