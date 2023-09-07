public class Player {
    private int id;
    private String name;
    private int str;

    public Player(int id, String name, int str) {
        this.id = id;
        this.name = name;
        this.str = str;
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

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

}
