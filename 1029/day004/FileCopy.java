package day004;



import java.io.*;
import java.util.Arrays;
import java.util.UUID;

/**
 * @ClassName 使用IO流实现文件复制
 * @Description TODO
 * @Author apple
 * @Date 2020/10/29
 **/
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //1.先将源文件读入内存数组

        File file1=new File("/Users/apple/Pictures/001.png");
        InputStream is=new FileInputStream(file1);
        byte[] b=new byte[(int)file1.length()];
        int read= is.read(b);
        //System.out.println(ReadResult);
        //System.out.println(Arrays.toString(b));

        //2.将内存数组中的值写到目标文件
        File file2=new File("/Users/apple/Pictures/"+ UUID.randomUUID().toString()+".jpg");
        OutputStream os=new FileOutputStream(file2);
        os.write(b);
        os.close();
        is.close();



    }
}
