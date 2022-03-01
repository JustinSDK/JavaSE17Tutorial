package cc.openhome;

class Variable3 {
    static volatile int i = 0;
    static int j = 0;

    static void increment() {
        i++;
        System.out.printf("thread1 變更了 i：%d%n", i);
    }

    static void showChanged() {
    	if(i != j) {
            j = i;
            System.out.printf("i 變更了：%d%n", j);
    	}
    }
}

public class Variable3Test {
    public static void main(String[] args) {
        var thread1 = new Thread(() -> {
            while(true) {
            	// 模擬每隔一段時間更新
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Variable3.increment();
            }
        });
        var thread2 = new Thread(() -> {
            while(true) {
                Variable3.showChanged();
            }
        });
        
        thread1.start();
        thread2.start();
    }
}
