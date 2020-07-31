package day05;

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
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * 
 * 实现Comparable接口，并重写抽象方法comparaTo()，比较规则为年龄小的人小。
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
        return name+",年龄:"+age+"性别:"+gender+",薪资:"+salary+",入职时间:"+hiredate;
    }

    public boolean equals(Object e){
        if(this==e){
            return true;
        }
        if(!(e instanceof day04.Emp)){
            return false;
        }
        Emp p=(Emp)e;
        return Objects.equals(this.name,p.name) && this.age == p.age;
    }

    @Override
    public int compareTo(Object o) {
        Emp p=(Emp)o;
        return this.age-p.age;
    }

//    public int compareTo(Object o,int i) {
//        Emp p=(Emp)o;
//        return this.hiredate.getTime()-p.hiredate.getTime();
//    }
//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.getAge() - o2.getAge();
//    }

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
