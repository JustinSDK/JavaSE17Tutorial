package cc.openhome;

class Clothes2 {
    String color;
    char size;
    
    /*
     * �ɤW�غc��
     */
}

public class Field2 {
    public static void main(String[] args) {
        // ���ӽd�ҭק�H�U���e
        var sun = new Clothes2();
        var spring = new Clothes2();
        
        sun.color = "red";
        sun.size = 'S';
        spring.color = "green";
        spring.size = 'M';
        
        System.out.printf("sun (%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring (%s, %c)%n", spring.color, spring.size);
    }
}