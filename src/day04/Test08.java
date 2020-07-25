package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        List<Date> list=new ArrayList();
        System.out.println("请输入三个日期(yyyy-MM-dd格式)：");
        Scanner ipt=new Scanner(System.in);
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        String str=ipt.next();
        list.add(sf.parse(str));
        str=ipt.next();
        list.add(sf.parse(str));
        str=ipt.next();
        list.add(sf.parse(str));
        System.out.println("排序前:"+list.toString());
        Collections.sort(list);
        System.out.println("排序后:"+list.toString());
    }
}
