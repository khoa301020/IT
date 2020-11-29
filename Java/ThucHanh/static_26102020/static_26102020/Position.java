package static_26102020;

public class Position {
    int x, y;
    static String infor;
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}

class MainClass {
    public static void main(String[] args) {
        Position dt1 = new Position();
        dt1.setX(30);
        dt1.setY(10);
        infor="aa";
    }
}
