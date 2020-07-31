package day05;


import java.util.Stack;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        for (int i = 1; i <6 ; i++) {
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
