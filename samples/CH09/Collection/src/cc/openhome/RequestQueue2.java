package cc.openhome;

import java.util.*;

interface Request2 {
    void execute();
}

public class RequestQueue2 {
    public static void main(String[] args) {
        var requests = new LinkedList<Request2>();
        offerRequestTo(requests);
        process(requests);
    }

    static void offerRequestTo(Queue<Request2> requests) {
        // 模擬將請求加入佇列
        for (var i = 1; i < 6; i++) {
            requests.offer(
                () -> System.out.printf("處理資料 %f%n", Math.random())
            );
        }
    }
    // 處理佇列中的請求
    static void process(Queue<Request2> requests) {
        while(requests.peek() != null) {
            var request = requests.poll();
            request.execute();
        }
    }
}