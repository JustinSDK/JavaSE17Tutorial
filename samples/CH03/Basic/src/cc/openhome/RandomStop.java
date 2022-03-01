package cc.openhome;

public class RandomStop {
    public static void main(String[] args) {
        while(true) {
            var number = (int) (Math.random() * 10);
            System.out.println(number);
            
            if(number == 5) {
                System.out.println("I hit 5....Orz");
                break;
            }
        }
    }
}
