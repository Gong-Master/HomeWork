package day06;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        File file=new File(".");
        String[] ss=file.list();
        for(String s:ss){
                System.out.println(s);
        }
    }
}
