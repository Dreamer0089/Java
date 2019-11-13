package Java_More.Thread;
/*
    多线程之间互不影响（在不同的栈空间）

    创建多线程程序
        第一种方式：创建Thread类的子类
                    实现步骤：
                        1.创建Thread类的子类
                        2.在Thread类的子类中重写run()方法，设置线程任务（开启线程要做什么）
                        3.创建Thread类的子类对象
                        4.调用Thread类中的start()方法，开启新的线程，执行run()方法
                             void start();使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
                                            结果是两个线程并发地运行；当前线程（从调用返回给 start 方法）和另一个线程（执行其 run 方法）。
                                            多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
                    Java程序属于抢占式调度，优先级高的线程先执行
        第二种方式：实现Runnable接口
                    实现步骤：
                        1.创建Runnable接口的实现类
                        2.在实现类中重写Runnable接口中的run()方法，设置线程任务
                        3.创建Runnable接口的实现类对象
                        4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
                        5.调用Thread类中的start()方法，开启线程，执行run方法
        两种方法的区别：
            实现Runnable接口创建多线程程序的好处：
                1.避免单继承的局限性
                2.增强程序的扩展性，降低了程序的耦合性


    线程名称：
        主线程：main
        新线程：Thread-0、Thread-1、Tread-2、Thread-3

    获取线程的名称：
        1.使用Thread类中的方法getName();
            String getName()    返回线程的名称
        2.先获取当前正在执行的线程，使用线程中的方法getName()获取线程名称
            static Thread currentThread()   返回正在执行的线程对象的引用
    设置线程的名称：
        1.使用Thread类中的方法setName("线程名称")
            void setName(String name)
        2.创建一个带参数的构造方法，参数传递线程名称，调用父类带参数的构造方法，让父类（Thread）给子线程取名字
            Thread(String name) 分配新的Thread对象

    static void sleep(long millis);在指定的毫秒数内让当前正在执行的线程休眠（暂停执行
    毫秒数结束后，线程继续执行
 */
public class DemoMainThread {
    public static void main(String[] args) {

//        MyThread myThread = new MyThread();
//        myThread.setName("线程一");
//        myThread.start();
//
//        new MyThread("线程二").start();


//        //模拟秒数
//        for (int i = 0; i < 60; i++) {
//            System.out.println(i);
//
//            //使用Thread类中的sleep方法让程序睡眠一秒
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
