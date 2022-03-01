package cc.openhome;

public class RPG {
    public static void main(String[] args) {
        var swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        System.out.println(swordsMan.toString());

        var magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        System.out.println(magician.toString());
    }
}
