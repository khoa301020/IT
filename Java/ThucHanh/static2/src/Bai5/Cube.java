package Bai5;

public class Cube {
    private static int x, S;

    Cube(int x) {
        Cube.x = x;
    }

    public static void CalCube() {
        S = (int) Math.pow(x, 3);
    }

    public static void main(String[] args) {
        Cube obj = new Cube(3);
        obj.CalCube();
        System.out.println(S);
    }
}
