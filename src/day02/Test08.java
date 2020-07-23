package day02;

import java.util.Scanner;

/**
 * 要求用户息输入若干员工信，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args){
        System.out.println("输入员工信息（例如:张三,25,男,5000;李四,26,女,6000;...）");
        Scanner ipt=new Scanner(System.in);
        String str= ipt.next();
        String[] str1=str.split("[(\\,,;)]+");
        Person[] p = new Person[str1.length/4];
        for(int i=0;i<str1.length;){
            Person a=new Person(str1[i],Integer.parseInt(str1[i+1]),str1[i+2],Integer.parseInt(str1[i+3]));
            p[i/4]=a;
            i=i+4;
        }
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].toString());
        }
    }
}
