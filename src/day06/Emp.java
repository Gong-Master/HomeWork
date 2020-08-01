package day06;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    张三,25,男,5000,2006-02-15
 * 
 * 定义equals方法，要求名字相同，则认为内容一致。
 * @author Bonnie
 *
 */
public class Emp implements Comparable{
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hiredate;
    Emp(){

    }
    Emp(String name,int age,String gender,int salary,Date hiredate){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
        this.hiredate=hiredate;
    }

    public String toString(){
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        return name+","+age+","+gender+","+salary+","+s.format(hiredate);
    }

    public boolean equals(Object e){
        if(this==e){
            return true;
        }
        if(!(e instanceof Emp)){
            return false;
        }
        Emp p=(Emp)e;
        return Objects.equals(this.name,p.name);
    }

    @Override
    public int compareTo(Object o) {
        Emp p=(Emp)o;
        return p.age-this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}
