package day03;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Date df=new Date();
        SimpleDateFormat a= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(a.format(df));
    }
}
