package cc.openhome;

public abstract class GuessGame {
    public void go() {
        var number = (int) (Math.random() * 10); 
        var guess = -1;
        do {
            print("輸入數字：");
            guess = nextInt();
        } while(guess != number);
        println("猜中了");
    }
    
    public void println(String text) {
        print(text + "\n");
    }

    public abstract void print(String text);
    public abstract int nextInt();
}