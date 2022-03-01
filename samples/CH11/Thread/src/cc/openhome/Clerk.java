package cc.openhome;

public class Clerk {
    private final int EMPTY = 0;
    private int product = EMPTY;

    public synchronized void setProduct(int product) throws InterruptedException {
        waitIfFull();
        this.product = product;
        System.out.printf("生產者設定 (%d)%n", this.product);
        notify();
    }

    private synchronized void waitIfFull() throws InterruptedException {
        while(this.product != EMPTY) {
            wait();
        }
    }

    public synchronized int getProduct() throws InterruptedException {
        waitIfEmpty();
        var p = this.product;
        this.product = EMPTY;
        System.out.printf("消費者取走 (%d)%n", p);
        notify();
        return p;
    }

    private synchronized void waitIfEmpty() throws InterruptedException {
        while(this.product == EMPTY) {
            wait();
        }
    }
}
