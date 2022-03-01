package cc.openhome;

public class RPG {
    
    
    
    
    public static void drawFight(Role role) {
        System.out.print(role.getName());
        role.fight();
    }

    public static void main(String[] args) {
        var swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);

        var magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        
        drawFight(swordsMan);
        drawFight(magician);
    }
}
