package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner ipt=new Scanner(System.in);
        System.out.println("请输入目录名");
        String str=ipt.next();
        if(new File(str).exists()){
            System.out.println("该目录已存在");
            int i=1;
            String s1;
            while (true){
                s1=str+"_副本"+i;
                if(!new File(str).exists()){
                    break;
                }
                i++;
            }
            new File(s1).mkdirs();
        }else{
            new File(str).mkdirs();
        }


        /*
        boolean b=false;
        File file=new File(".");
        String[] ss=file.list();
        for(String s:ss){
            if(s.equals(str)){
                System.out.println("该目录已存在");
                b=true;
                break;
            };
        }
        if(b){
            int i=1;
            String s1=str;
            c:while (b){
                b=false;
                s1=str+"_副本"+i;
                for(String s:ss){
                    if(s.equals(s1)){
                        b=true;
                        i++;
                        continue c;
                    }
                }
            }
            new File(s1).mkdirs();
        }else{
            new File(str).mkdirs();
        }*/
    }
}
