package day06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2017-06-30 14:22:16
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        File file=new File("myfile.txt");
        System.out.println("文件名："+file.getName());
        System.out.println("大小："+file.length());
        SimpleDateFormat sl=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=sl.format(new Date(file.lastModified()));
        System.out.println("最后修改时间："+s);
    }
}
