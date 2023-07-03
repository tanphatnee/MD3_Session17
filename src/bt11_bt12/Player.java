package bt11_bt12;

import java.io.Serializable;

public class Player implements Serializable {
    private int id;
    private String name;
    private String team;

    public Player() {
    }

    public Player(int id, String name, String team) {
        this.id = id;
        this.name = name;
        this.team = team;
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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                " | Team: " + team ;
    }
}
