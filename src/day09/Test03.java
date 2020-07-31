package day09;

import static java.lang.Thread.sleep;

/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 1; i < 1001; i++) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("你好"+i);
            }
        }).start();
        new Thread(() -> {
            for (int i = 1; i < 1001; i++) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("再见"+i);
            }
        }).start();
    }
}
