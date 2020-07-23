package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入一个IP地址：");
        Scanner ipt=new Scanner(System.in);
        String str=ipt.next();
        String[] str1=str.split("[.]+");
        System.out.println(Arrays.toString(str1));
    }
}
