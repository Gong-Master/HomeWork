package day06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Bonnie
 *
 */
public class Test12 {
    public static void main(String[] args) throws IOException, ParseException {
        HashMap<String,Emp> mp=Catchmap();
        Scanner ipt=new Scanner(System.in);
        System.out.println("请输入员工名字");
        String str=ipt.next();
        if(mp.containsKey(str)){
            mp.get(str).toString();
            SimpleDateFormat sl=new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal=Calendar.getInstance();
            cal.setTime(mp.get(str).getHiredate());
            cal.add(20,Calendar.YEAR);
            String s=sl.format(cal.getTime());
            System.out.println("入职20周年纪念日派对日期:"+s);
        }
        else{
            System.out.println("查无此人");
        }
    }

    public static HashMap<String,Emp> Catchmap() throws IOException, ParseException {
        HashMap<String,Emp> hp=new HashMap<>();

        File[] files=new File(".").listFiles((pathname) -> {
            String s=pathname.getName();
            return s.endsWith(".emp");
        });

        SimpleDateFormat a= new SimpleDateFormat("yyyy-MM-dd");
        String sname,txt="";
        String[] s;
        InputStream in;
        Emp e;

        for(File file:files){
            sname=file.getName();
            in=new FileInputStream(sname);
            int i;
            while((i=in.read())!=-1){
                txt+=i;
            }
            s=txt.split("[,]+");
            e=new Emp(s[0],Integer.parseInt(s[1]),s[2],Integer.parseInt(s[3]),a.parse(s[4]));
            hp.replace(e.getName(),e);
        }

        return hp;
    }
}
