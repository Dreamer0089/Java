package Java_More.Thread;
/*
    线程安全问题解决方案：
        1.使用同步代码块：
            格式：
                synchronized(锁对象){
                    可能会出现线程安全问题的代码(访问了共享数据的代码)
                }
            注意：
                1.通过代码块中的锁对象，可以使用任意对象
                2.必须保证多个线程使用的锁对象是同一个
                3.锁对象的作用：把同步代码快锁住，只让一个线程再同步代码块中执行
            同步技术原理：
                使用了一个锁对象，这个锁对象叫同步锁，也叫对象锁、对象监视器
                即多个线程一起抢夺CPU的执行权，谁抢到就执行谁的run方法进行买票
                CPU中始终只有一个线程在执行
                总结：同步中的线程没有执行不会释放锁；
                      同步外的线程没有锁不能进入同步
                      同步保证了只能由一个线程在同步中执行共享数据
                      保证了安全；但是程序频繁的判断锁、获取锁、释放锁，程序的效率会降低
        2.使用同步方法：
            使用步骤：
                1.把访问了共享数据的代码抽取出来，放入一个方法中
                2.在方法上添加synchronized修饰符
            格式：
                修饰符 synchronized 返回值类型 方法名（参数列表） {
                    共享数据的代码
                }
            原理：同步方法会把方法内部的对象（线程实现类对象）锁住，
                  只让一个线程执行
                  静态同步方法的锁对象是本类的class属性--->class文件对象
        3.Lock锁
            java.util.concurrent.locks Lock接口
            Lock接口中的方法：
                void lock();获取锁
                void unlock();释放锁
            使用步骤：
                1.在成员位置创建一个ReentrantLock对象
                2.在可能出现安全问题的代码前调用Lock接口中的方法lock()获取锁
                3.在可能出现安全问题的代码后调用Lock接口中的方法unlock()释放锁

 */



public class DemoThreadSafe {
    public static void main(String[] args) {
        Runnable run = new MyRunnable();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }



}
