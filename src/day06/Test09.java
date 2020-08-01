package day06;

import java.io.*;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        File file=new File("note.txt");
        file.createNewFile();
        System.out.println("请输入内容");
        xie(file.getName());
    }
    public static void xie(String name) throws IOException {
        Scanner ipt=new Scanner(System.in);
        String str=ipt.next();
        OutputStream out=new FileOutputStream(name,true);
        while(!str.equals("exit")) {
            for (int i = 0; i < str.length(); i++) {
                out.write(str.charAt(i));
            }
            str=ipt.next();
        }
    }
}
