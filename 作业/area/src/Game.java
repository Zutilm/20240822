public class Game {
    public static void main(String[] args) {
        Role r1 = new Role("大",100);
        Role r2 = new Role("小",100);

        while (true){
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "ko" + r2.getName());
                break;
            }

            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + "ko" + r1.getName());
                break;
            }
        }
    }
}