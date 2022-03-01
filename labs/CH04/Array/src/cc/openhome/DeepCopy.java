package cc.openhome;

class Clothes2 {
    String color;
    char size;
    Clothes2(String color, char size) {
        this.color = color;
        this.size = size;
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        Clothes2[] c1 = {new Clothes2("red", 'L'), new Clothes2("blue", 'M')};
        var c2 = new Clothes2[c1.length];
        
        for(var i = 0; i < c1.length; i++) {
            /*
             * ¸É¤Wµ{¦¡½X
             * /
        }
        
        c1[0].color = "yellow";
        System.out.println(c2[0].color);
    }
}
