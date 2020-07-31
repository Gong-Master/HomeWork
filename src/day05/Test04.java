package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args){
        Map<String,String> m=new HashMap();
        System.out.println("输入该学生成绩(格式:  科目:成绩;科目:成绩;... 例如：语文:99;数学:98;英语:97;物理:96;化学:95):");
        Scanner ipt=new Scanner(System.in);
        String str=ipt.next();
        String[] s=str.split("[;]+");
        String[] s2;
        for(int i=0;i<s.length;i++){
            s2=s[i].split("[:]");
            m.put(s2[0],s2[1]);
        }
        System.out.println("物理："+m.get("物理"));
        m.replace("化学","96");
        m.remove("英语");
        System.out.println("key-----------------------");
        Iterator iter=m.keySet().iterator();
        while(iter.hasNext()){
            String key=(String)iter.next();
            System.out.println(key+ " "+ m.get(key));
        }
        System.out.println("key1-----------------------");
        Set<String> iter1=m.keySet();
        for(String key:iter1){
            String value= (String) m.get(key);
            System.out.println(key+ " "+ value);
        }
        System.out.println("entry-----------------------");

        Set<Map.Entry<String,String>> set = m.entrySet();
        for(Map.Entry<String,String> en:set){
            String key=en.getKey();
            String value=en.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("value-----------------------");
        iter=m.values().iterator();
        while(iter.hasNext()){
            String value=(String)iter.next();
            System.out.println(value);
        }
        Collection values = m.values();
        System.out.println("value1-----------------------");
        Collection values1 = m.values();
        for(Object sss:values1){
            System.out.println((String)sss);
        }
    }
}
