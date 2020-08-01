package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
public class Test11 {
    public static void main(String[] args) throws IOException, ParseException {
        Catch();
    }

    public static void Catch() throws IOException, ParseException {
        List<Emp> list=new ArrayList<>();

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
            list.add(e);
        }

        Collections.sort(list);
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
}
