package bt03_bt04;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // đọc vs ghi số nguyên ( Int )
        File file = new File("C:\\Users\\ADMIN\\Desktop\\MODULE 3\\SS17_BaiTap\\src\\bt03_bt04\\number.txt") ;

        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            // write to file
            dos.writeInt(274);
            dos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        try  {

            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            // read from file
            System.out.println("Number: "+dis.readInt());
            dis.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

