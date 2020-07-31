package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        List<Emp> list = new ArrayList<>();
        System.out.println("请输入员信息(例如:张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...):");
        Scanner ipt = new Scanner(System.in);
        String str = ipt.next();
        SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");
        String[] s1;
        String[] s = str.split("[;]+");
        p:
        for (String ss : s) {
            s1 = ss.split("[,]+");
            Emp e = new Emp(s1[0], Integer.parseInt(s1[1]), s1[2], Integer.parseInt(s1[3]), a.parse(s1[4]));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if ((it.next()).equals(e)) {
                    continue p;
                }
            }
            list.add(e);
        }
        Collections.sort(list);
        for (Emp emp : list) {
            System.out.println(emp);
        }
        Emp compare;
        int index;
        for(int i=0;i<list.size()-1;i++){
            index=list.size()-1-i;
            for(int j=0;j<list.size()-1-i;j++){
                if(list.get(j).getHiredate().getTime()<list.get(index).getHiredate().getTime()){
                    index=j;
                }
            }
            if(index!=list.size()-1-i){
                compare=list.get(list.size()-1-i);
                list.set(list.size()-1-i,list.get(index));
                list.set(index,compare);
            }
        }
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
}
