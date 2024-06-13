package src;
import java.util.UUID;

public class Character {//
//    Variable called id of data type string, auto-generated (Private member)
    private String id;
    private String name;
    private int hp;
    private boolean isAlive;

    public character(String name, int hp) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.name = name;
        this.hp = hp;
        this.isAlive = true;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}

