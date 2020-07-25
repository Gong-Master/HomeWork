package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        System.out.println("输入身份证号");
        Scanner ipt=new Scanner(System.in);
        SimpleDateFormat a= new SimpleDateFormat("yyyyMMdd");
        String s=ipt.next();
        while(!s.matches("[\\d]{17}[(\\d,X)]")){
            System.out.println("输入正确身份证号");
            s=ipt.next();
        }
        s=s.substring(6,14);
        Date time=a.parse(s);
        a=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("出生日期："+a.format(time));
        Calendar cal=Calendar.getInstance();
        cal.setTime(time);
        cal.add(Calendar.YEAR,20);
        System.out.println("20岁生日："+a.format(time=cal.getTime()));
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        System.out.println("当周的周三为："+a.format(time=cal.getTime()));
    }
}
