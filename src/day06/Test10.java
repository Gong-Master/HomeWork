package day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。

 * @author Bonnie
 *
 */
public class Test10 {
    public static void main(String[] args) throws ParseException, IOException {
        OutputStream out;
        System.out.println("请输入一个员工信息(格式为：name,age,gender,salary,hiredate) "+'\n'+" 例如:张三,25,男,5000,2006-02-15");
        Scanner ipt=new Scanner(System.in);
        SimpleDateFormat a= new SimpleDateFormat("yyyy-MM-dd");
        Emp e;
        String str;
        String[] s;
        for (int i = 0; i < 5; i++) {
            str=ipt.next();
            s=str.split("[,]+");
            e=new Emp(s[0],Integer.parseInt(s[1]),s[2],Integer.parseInt(s[3]),a.parse(s[4]));
            out=new FileOutputStream(s[0]+".emp");
            str=e.toString();
            for (int j = 0; j < str.length(); j++) {
                out.write(str.charAt(i));
            }
        }
    }
}
