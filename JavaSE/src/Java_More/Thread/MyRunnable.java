package Java_More.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {

    private int ticket = 100;

    Object obj = new Object();

    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
            if(ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票！");
                ticket--;
            }
            l.unlock();
        }
    }

//    public void run() {
//        while (true) {
////            synchronized (obj) {
////                if(ticket > 0) {
////                    try {
////                        Thread.sleep(10);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
////                    System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票！");
////                    ticket--;
////                }
////            }
//            payTicket();
//        }
//    }

//    public synchronized  void payTicket() {
//        if(ticket > 0) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票！");
//            ticket--;
//        }
//    }
}
