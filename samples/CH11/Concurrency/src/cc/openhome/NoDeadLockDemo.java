package cc.openhome;

import java.util.concurrent.locks.*;

class Resource {
    private ReentrantLock lock = new ReentrantLock();
    private String name;

    Resource(String name) {
        this.name = name;
    }
    
    void cooperate(Resource res) {
        while (true) {
            try {
                if(lockMeAnd(res)) {
                    System.out.printf("%s 整合 %s 的資源%n", this.name, res.name);
                    break;
                }
            } finally {
                unLockMeAnd(res);
            }
        }
    }

    private boolean lockMeAnd(Resource res) {
        return this.lock.tryLock() && res.lock.tryLock();
    }

    private void unLockMeAnd(Resource res) {
        if(this.lock.isHeldByCurrentThread()) {
            this.lock.unlock();
        }
        if(res.lock.isHeldByCurrentThread()) {
            res.lock.unlock();
        }
    }
}

public class NoDeadLockDemo {
    public static void main(String[] args) {
        var res1 = new Resource("resource1");
        var res2 = new Resource("resource2");
        
        var thread1 = new Thread(() -> {
            for(var i = 0; i < 10; i++) {
                res1.cooperate(res2);
            }
        });
        var thread2 = new Thread(() -> {
            for(var i = 0; i < 10; i++) {
                res2.cooperate(res1);
            }
        });
        
        thread1.start();
        thread2.start();
    }
}
