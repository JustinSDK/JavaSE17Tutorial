package cc.openhome;

class Variable2 {
    static int i = 0;
    static int j = 0;

    static synchronized void increment() {
        i++;
        System.out.printf("thread1 變更了 i：%d%n", i);
    }

    static synchronized void showChanged() {
    	if(i != j) {
            j = i;
            System.out.printf("i 變更了：%d%n", j);
    	}
    }
}

public class Variable2Test {
    public static void main(String[] args) {
        var thread1 = new Thread(() -> {
            while(true) {
            	// 模擬每隔一段時間更新
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Variable2.increment();
            }
        });
        var thread2 = new Thread(() -> {
            while(true) {
                Variable2.showChanged();
            }
        });
        
        thread1.start();
        thread2.start();
    }
}
