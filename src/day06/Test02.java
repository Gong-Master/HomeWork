package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner ipt=new Scanner(System.in);
        System.out.println("请输入文件名");
        String str=ipt.next();
        if(new File(str).exists()){
            System.out.println("该文件已存在");
            int i=1;
            String s1;
            while (true){
                s1=str.substring(0,str.lastIndexOf("."))+"_副本"+i+str.substring(str.lastIndexOf("."));
                if(!new File(str).exists()){
                    break;
                }
                i++;
            }
            new File(s1).createNewFile();
        }else{
            new File(str).createNewFile();
        }

        /*
        boolean b=false;
        File file=new File(".");
        String[] ss=file.list();
        for(String s:ss){
            if(s.equals(str)){
                System.out.println("该文件已存在");
                b=true;
                break;
            };
        }
        if(b){
            int i=1;
            String s1=str;
            c:while (b){
                b=false;
                s1=str.substring(0,str.lastIndexOf("."))+"_副本"+i+str.substring(str.lastIndexOf("."));
                for(String s:ss){
                    if(s.equals(s1)){
                        b=true;
                        i++;
                        continue c;
                    }
                }
            }
            new File(s1).createNewFile();
        }else{
            new File(str).createNewFile();
        }*/
    }
}
