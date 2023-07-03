package bt05_bt06;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // đọc vs ghi chuỗi ( UTF )
        File file = new File("C:\\Users\\ADMIN\\Desktop\\MODULE 3\\SS17_BaiTap\\src\\bt05_bt06\\string.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            // write to file
            dos.writeUTF("This is string");
            dos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        try  {

            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            // read from file
            System.out.println("String: "+dis.readUTF());
            dis.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
