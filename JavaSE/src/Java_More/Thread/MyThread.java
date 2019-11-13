package Java_More.Thread;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //System.out.println(getName());
        //获取线程名称
         System.out.println(Thread.currentThread().getName());
    }

}
