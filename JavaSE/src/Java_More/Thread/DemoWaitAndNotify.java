package Java_More.Thread;
/*
        等待唤醒案例：线程之间的通信
            创建顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait()方法，放弃CPU的执行，进入WAITING状态（无限等待状态）
            创建老板线程（生产者）：花5秒做包子，做好之后，调用notify()方法，唤醒顾客吃包子
        注意：
            顾客和老板线程必须使用同步代码块包裹起来，保证等待等待和唤醒只能有一个在执行
            同步使用的锁对象必须保证唯一
            只有锁对象才能调用wait和notify方法

        Object类中的方法
        void wait()：在其他线程调用此对象的notify或notifyAll方法前，导致当前线程等待
        void notify()：唤醒在此对象监视器上等待的单个线程。会继续执行wait方法之后的代码

        进入TimeWaiting（计时等待）有两种方式
            1.使用sleep(long m)方法，在毫秒值结束后，线程睡醒进入到Runnable/Blocked状态
            2.使用wait(long m) 方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动睡醒进入到Runnable/Blocked状态
        唤醒的方法：
            1.notify

 */

public class DemoWaitAndNotify {
    public static void main(String[] args) {
        Object o = new Object();

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        //保证等待和唤醒的线程只能由一个在执行，需要使用同步代码块
                        System.out.println("告知老板要的包子的种类和数量");
                        //使用wait方法，放弃CPU的执行，进入到WAITING状态（无限等待状态）
                        try {
                            o.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好，开吃！");
                        System.out.println("========================");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    //花5秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o) {
                        System.out.println("老板5秒之后做好包子，告知顾客吃包子");
                        o.notify();
                    }
                }
            }

        }.start();
    }
}
