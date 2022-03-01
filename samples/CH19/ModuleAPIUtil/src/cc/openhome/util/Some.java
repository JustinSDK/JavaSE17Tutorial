package cc.openhome.util;

public class Some {
    private int some;
    
    public void openTo(Module module) {
        Some.class.getModule().addOpens("cc.openhome.util", module); 
    }
} 
