package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		for(int i=0;i<5;i++) {
			if((int)(Math.random() * 2)==0) {
				sb.append((char) (int) (Math.random() * 26 + 97));
			}else
				sb.append((char) (int) (Math.random() * 26 + 65));
		}
		String str = sb.toString();
		System.out.println(str);
		Scanner ipt = new Scanner(System.in);
		System.out.println("请输入验证码：");
		String str1=ipt.next();
		System.out.println(str1.toUpperCase().equals(str.toUpperCase()));
	}
	
}
