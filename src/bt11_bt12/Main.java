package bt11_bt12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // đọc vs ghi list object
        File file = new File("C:\\Users\\ADMIN\\Desktop\\MODULE 3\\SS17_BaiTap\\src\\bt11_bt12\\listPlayer.txt");
        List<Player> players = new ArrayList<>();
        players.add(new Player(1, "Paulo Dybala", "AS Roma"));
        players.add(new Player(1, "Harry Kane", "Tottenham"));
        players.add(new Player(1, "Erling Haaland", "Man City"));
        players.add(new Player(1, "Mohamed Salah", "Liverpool"));
        players.add(new Player(1, "Granit Xhaka", "Arsenal"));
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(players);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            players = (List<Player>) ois.readObject();
            fis.close();
            ois.close();
            for (Player player : players){
                System.out.println(player);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
