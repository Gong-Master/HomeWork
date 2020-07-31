package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02{
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                for (int i = 1; i < 1001; i++) {
                    try {
                        sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("你好"+i);
                }
            }
        };

        Thread t2=new Thread(){
            public void run(){
                for (int i = 1; i < 1001; i++) {
                    try {
                        sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("再见"+i);
                }
            }
        };

        t1.start();
        t2.start();
    }
}
