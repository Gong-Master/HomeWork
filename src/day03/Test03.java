package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        System.out.println("输入生日，格式为\"yyyy-MM-dd\"");
        Scanner ipt=new Scanner(System.in);
        Date df=new Date();
        SimpleDateFormat a= new SimpleDateFormat("yyyy-MM-dd");
        Date time=a.parse(ipt.next());
        System.out.println(a.format(df));
        int count;
        long l=df.getTime()-time.getTime();
        count=(int)(l/7/24/60/60/1000);
        System.out.println(count);
    }
}
