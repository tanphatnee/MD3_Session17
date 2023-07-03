package bt01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Viết một chương trình cho phép người dùng
        // thêm, hiển thị, tìm kiếm thông tin sản phẩm vào file.
        File file = new File("C:\\Users\\ADMIN\\Desktop\\MODULE 3\\SS17_BaiTap\\src\\bt01\\Product.txt");
        List<Product> products = new ArrayList<>();
        while (true) {
            System.out.println("1. Thêm");
            System.out.println("2. Hiển thị");
            System.out.println("3. Tìm kiếm");
            System.out.println("Chọn chức năng: ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    Product product = new Product();
                    product.inputData();
                    products.add(product);
                    writeToFile(file, products);
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    readDataFromFile(file, products);
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Nhập từ khóa");
                    String keyword = new Scanner(System.in).nextLine();
                    searchFromFile(file, products, keyword);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Invalid");
            }
        }
    }

    public static void writeToFile(File file, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(File file, List<Product> products) {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public static void searchFromFile(File file, List<Product> products, String keyword) {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            boolean check = true;
            for (Product product : products) {
                if (product.getName().contains(keyword)) {
                    System.out.println(product);
                    check = false;

                }
            }
            if (check) {
                System.err.println("Không tìm thấy sản phẩm");
            }
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
