package com.hjj.boot.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async
    public void toPrintLog() {
        System.err.println(Thread.currentThread().getName());
    }

    public void toInvokeThisAsync() {
        toPrintLog();
    }
}
