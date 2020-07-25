package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        System.out.println("输入生产日期，格式为\"yyyy-MM-dd\"");
        Scanner ipt=new Scanner(System.in);
        SimpleDateFormat a= new SimpleDateFormat("yyyy-MM-dd");
        Date time=a.parse(ipt.next());
        Calendar cal=Calendar.getInstance();
        cal.setTime(time);
        System.out.println("输入保质期天数");
        cal.add(Calendar.DAY_OF_YEAR,Integer.parseInt(ipt.next()));
        cal.add(Calendar.WEEK_OF_MONTH,-2);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        System.out.println(cal.get(Calendar.YEAR)+"年 "+cal.get(Calendar.MONTH)+"（+1）月"+cal.get(Calendar.DATE)+"日 "+cal.get(Calendar.DAY_OF_WEEK));
    }
}
