package bt01;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
    private int id;
    private String name;
    private String brand;
    private double price;
    private String des;

    public Product() {
    }

    public Product(int id, String name, String brand, double price, String des) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", des='" + des + '\'' +
                '}';
    }
    public void inputData(){
        System.out.println("Nhập id");
        id = new Scanner(System.in).nextInt();
        System.out.println("Nhập name");
        name = new Scanner(System.in).nextLine();
        System.out.println("Nhập brand");
        brand = new Scanner(System.in).nextLine();
        System.out.println("Nhập price");
        price = new Scanner(System.in).nextDouble();
        System.out.println("Nhập des");
        des = new Scanner(System.in).nextLine();
    }
}
