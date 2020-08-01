package day06;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File file=new File(".");
        File[] ss=file.listFiles((pathname) -> pathname.isFile());
        /*File[] cc=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });*/
        System.out.println(Arrays.toString(ss));
    }
}
