import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] ca = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Car c = new Car();
            System.out.println("请输入品牌");
            String brand = sc.next();
            c.setName(brand);

            System.out.println("请输入价钱");
            double price = sc.nextInt();
            c.setPrice(price);

            System.out.println("请输入颜色");
            String color = sc.next();
            c.setColor(color);

            ca[i] = c;
        }

        for (int i = 0; i < ca.length; i++) {
            Car car = ca[i];
            System.out.println(car.getName()+","+car.getPrice()+","+car.getColor());
        }
    }
}