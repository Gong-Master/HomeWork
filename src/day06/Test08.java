package day06;

import java.io.*;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        OutputStream out=new FileOutputStream("raf.dat",true);
        String c=String.valueOf(Integer.MAX_VALUE);
        for(int i=0;i<c.length();i++){
            out.write(c.charAt(i));
        }
        String d=String.valueOf(Long.MAX_VALUE);
        for(int i=0;i<d.length();i++){
            out.write(d.charAt(i));
        }
        InputStream in=new FileInputStream("raf.dat");
        int i;
        while((i=in.read()) != -1) {
            System.out.println(i);
        }
    }
}
