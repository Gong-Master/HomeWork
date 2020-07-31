package day09;

import static java.lang.Thread.sleep;

/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Runnable r1=new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i < 1001; i++) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("你好" + i);
                }
            }
        };
        Runnable r2=new Runnable()  {
            @Override
            public void run() {
                for (int i = 1; i < 1001; i++) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("再见" + i);
                }
            }
        };

        Thread t1=new Thread(r1,"000");
        Thread t2=new Thread(r2,"000");
        t1.start();
        t2.start();
    }
}
