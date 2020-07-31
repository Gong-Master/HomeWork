package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Thread.sleep;

/**
 * 创建一个线程，每秒输出一次当前系统时间:yyyy-MM-dd HH:mm:ss
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Date d;
                String s;
                SimpleDateFormat sl=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                while(true) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    s=sl.format(d=new Date());
                    System.out.println(s);
                }
            }
        }).start();

    }
}
