package day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args){
        List<Integer> list=new ArrayList();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        List<Integer> list1=list.subList(3,7);
        for(int i=0;i<list1.size();i++){
            list1.set(i,list1.get(i)*10);
        }
        System.out.println(list1.toString());
        System.out.println(list.toString());
        list.remove(7);
        list.remove(7);
        list.remove(7);
        System.out.println(list.toString());
    }
}
