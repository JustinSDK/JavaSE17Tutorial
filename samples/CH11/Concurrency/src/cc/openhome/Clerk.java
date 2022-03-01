package cc.openhome;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clerk {
    private final int EMPTY = 0;
    private int product = EMPTY;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void setProduct(int product) throws InterruptedException {
        lock.lock();        
        try {
            waitIfFull();
            this.product = product;
            System.out.printf("生產者設定 (%d)%n", this.product);
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    private void waitIfFull() throws InterruptedException {
        while(this.product != EMPTY) {
            condition.await();
        }
    }

    public int getProduct() throws InterruptedException {
        lock.lock();        
        try {
            waitIfEmpty();
            var p = this.product;
            this.product = EMPTY;
            System.out.printf("消費者取走 (%d)%n", p);
            condition.signal();
            return p;
        } finally {
            lock.unlock();
        }
    }

    private void waitIfEmpty() throws InterruptedException {
        while(this.product == EMPTY) {
            condition.await();
        }
    }
}
