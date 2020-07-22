package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner ipt=new Scanner(System.in);
        String str=ipt.next();
        int num=0,flag,count=0;
        boolean b=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                b=false;
                continue;
            }
            flag = (str.charAt(i) - 48);
            num *= 10;
            if(b==false){
                count++;
            }
            num += flag;
        }
        if(b==true) {
            int i=Integer.parseInt(str);
            System.out.println(num*10);
            System.out.println(i*10);
        }else{
            double d=Double.parseDouble(str);
            System.out.println((double)num*5*Math.pow(0.1,count));
            System.out.println(d*5);
        }
    }
}
