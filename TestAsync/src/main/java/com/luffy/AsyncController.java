package com.luffy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class AsyncController {

    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    @RequestMapping("async")
    public String async() {
//        doTask();
        executor.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("doing export");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        return "doing task";
    }

    public void doTask() {
        new Thread(() -> {
            try {
                Thread.sleep(10000);
                System.out.println("异步Task");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    class Tasks implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
                System.out.println("finished tasks");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
