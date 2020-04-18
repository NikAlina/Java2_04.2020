package lesson1;

public class Wall  {
    private int id;
    private int height;
    private static int counter;

    public Wall(int id, int height) {
        this.id = id;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }


}
