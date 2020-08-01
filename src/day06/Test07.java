package day06;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner ipt=new Scanner(System.in);
		System.out.println("请输入要复制的文件");
		String str=ipt.next();
		copy1(str);
		copy2(str);
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public static void copy1(String name) throws IOException {
		InputStream in=new FileInputStream(name);
		String s=name.substring(0,name.lastIndexOf("."))+"_copy"+name.substring(name.lastIndexOf("."));
		OutputStream out=new FileOutputStream(s,true);
		int i;
		while((i=in.read()) != -1) {
			out.write(i);
		}
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public static void copy2(String name){
		
	}
}
