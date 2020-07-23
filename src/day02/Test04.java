package day02;

import java.util.Arrays;

/**
 * 将字符串"123abc456def789ghi"中的英文部分替换为"#char#"
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args){
        String str="123abc456def789ghi";
        str=str.replaceAll("[a-z]+","#char#");
        System.out.println(str);
    }
}
