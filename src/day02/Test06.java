package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args){
        System.out.println("输入电话号码(例如：0415-5561111):");
        Scanner ipt= new Scanner(System.in);
        String str=ipt.next();
        boolean b = str.matches("[\\d]{3,4}[-][\\d]{7,8}");
        System.out.println(b);
    }
}
