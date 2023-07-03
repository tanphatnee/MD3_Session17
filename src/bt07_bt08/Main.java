package bt07_bt08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // đọc vs ghi list số nguyên
        File file = new File("C:\\Users\\ADMIN\\Desktop\\MODULE 3\\SS17_BaiTap\\src\\bt07_bt08\\listNumber.txt") ;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            // write to file
            dos.writeInt(111);
            dos.writeInt(222);
            dos.writeInt(333);
            dos.writeInt(444);
            dos.writeInt(555);
            dos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        List<Integer> numbers = new ArrayList<>();
        try  {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            // read from file
            // available kiểm tra xem còn dữ liệu đọc không, nếu còn tiếp tục read
            while (dis.available() > 0){
                numbers.add(dis.readInt());
            }
            dis.close();
            System.out.println(numbers);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
