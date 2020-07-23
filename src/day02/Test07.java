package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args){
        System.out.println("输入一个数学计算表达式，如:1+2");
        Scanner ipt = new Scanner(System.in);
        String str=ipt.next();
        String[] str1=str.split("[(+,-,*,/)]");
        String[] str2=str.split("[(\\d,.)]+");
        double result=0;
        switch (str2[1]){
            case "+":result=Double.parseDouble(str1[0])+Double.parseDouble(str1[1]);
                break;
            case "-":result=Double.parseDouble(str1[0])-Double.parseDouble(str1[1]);
                break;
            case "*":result=Double.parseDouble(str1[0])*Double.parseDouble(str1[1]);
                break;
            case "/":result=Double.parseDouble(str1[0])/Double.parseDouble(str1[1]);
                break;
            default:
        }
        System.out.println(str1[0]+str2[1]+str1[1]+"="+result);
    }
}
