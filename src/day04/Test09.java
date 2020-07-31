package day04;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Collection<Emp> col=new ArrayList<>();
        System.out.println("请输入员信息(例如:张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...):");
        Scanner ipt=new Scanner(System.in);
        String str=ipt.next();
        SimpleDateFormat a= new SimpleDateFormat("yyyy-MM-dd");
        String[] s1;
        String[] s=str.split("[;]+");
        p:for(String ss:s){
            s1=ss.split("[,]+");
            Emp e=new Emp(s1[0],Integer.parseInt(s1[1]),s1[2],Integer.parseInt(s1[3]),a.parse(s1[4]));
            Iterator it=col.iterator();
            while (it.hasNext()){
                if((it.next()).equals(e)){
                    continue p;
                }
            }
            col.add(e);
        }
        Calendar cal=Calendar.getInstance();
        for (Emp emp : col) {
            System.out.println(emp);
            cal.setTime(emp.getHiredate());
            cal.add(Calendar.MONTH,3);
            cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
            System.out.println(a.format(cal.getTime()));
        }
    }
}
