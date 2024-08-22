import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import javax.xml.soap.SOAPPart;
import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买舱位  0头等舱 1经济舱");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10){
            ticket = getTicket(ticket, seat,0.9,0.85);
        }else if((month >= 1 && month <= 4) || (month >= 11 && month <= 12)){
            ticket = getTicket(ticket, seat,0.7,0.65);
        }
        System.out.println(ticket);
    }

    private static int getTicket(int ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            ticket = (int) (ticket * v0);
        } else {
            ticket = (int) (ticket * v1);
        }
        return ticket;
    }
}
