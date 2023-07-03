package bt02;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingStream(File source, File target) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            int copyByte = 0;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
                copyByte += length;
            }
            System.out.println(copyByte+" bytes");
        } finally {
            is.close();
            os.close();
        }
    }
    public static void main(String[] args) {
        System.out.print("Source file : ");
        // C:\Users\ADMIN\Desktop\MODULE 3\SS17_BaiTap\src\bt02\source.txt
        String sourcePath = new Scanner(System.in).nextLine();
        System.out.print("Target file: ");
        // C:\Users\ADMIN\Desktop\MODULE 3\SS17_BaiTap\src\bt02\target.txt
        String targetPath = new Scanner(System.in).nextLine();
        // tạo file
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
            return;
        }
        if (targetFile.exists()) {
            System.out.println("Tệp tin đích đã tồn tại.");
            return;
        }
        try {
            copyFileUsingStream(sourceFile, targetFile);
            System.out.println("Copy thành công");
        } catch (IOException ioe) {
            System.out.println("Copy thất bại ");
            System.out.println(ioe.getMessage());
        }

    }
}
