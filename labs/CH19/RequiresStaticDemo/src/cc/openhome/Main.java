package cc.openhome;

public class Main {
    public static void main(String[] args) {
        if(args.length != 0 && "test".equals(args[0])) {
            cc.openhome.test.Test.fromTestModule();
        } else {
            System.out.println("應用程式正常流程");
        }
    }
}
