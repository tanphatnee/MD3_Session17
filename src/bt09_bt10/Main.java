package bt09_bt10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // đọc vs ghi list chuỗi
        File file = new File("C:\\Users\\ADMIN\\Desktop\\MODULE 3\\SS17_BaiTap\\src\\bt09_bt10\\listString.txt") ;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            // write to file
            dos.writeUTF("Hello world1");
            dos.writeUTF("Hello world2");
            dos.writeUTF("Hello world3");
            dos.writeUTF("Hello world4");
            dos.writeUTF("Hello world5");
            dos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        List<String> strings = new ArrayList<>();
        try  {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            // read from file
            // available kiểm tra xem còn dữ liệu đọc không, nếu còn tiếp tục read
            while (dis.available() > 0){
                strings.add(dis.readUTF());
            }
            dis.close();
            System.out.println(strings);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
