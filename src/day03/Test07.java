package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        Collection<Emp> col=new ArrayList<>();
        System.out.println("请输入员工人数：");
        Scanner ipt=new Scanner(System.in);
        String str=ipt.next();
        SimpleDateFormat a= new SimpleDateFormat("yyyy-MM-dd");
        Integer b=Integer.parseInt(str);
        pin:for(int i=0;i<b;i++){
            System.out.println("请输入员信息：(例如:张三,25,男,5000,2006-02-15)");
            str=ipt.next();
            String[] str1=str.split("[,]+");
            Emp e=new Emp(str1[0],Integer.parseInt(str1[1]),str1[2],Integer.parseInt(str1[3]),a.parse(str1[4]));
            Emp e1=new Emp();
            Iterator it=col.iterator();
            while (it.hasNext()){
                if(it.next().equals(e)){
                    i--;
                    continue pin;
                }
            }
            col.add(e);
        }
        System.out.println(col.toString());
    }
}
