package Bai4;

public class Block {
    public static int a = 23;
    public static int b, max;

    static {
        System.out.println("First static block");
        b = a * 4;
    }

    static {
        System.out.println("Second static block");
        max = 30;
    }

    static void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(max);
    }

    public static void main(String[] args) {
        System.out.println(max);
        Block obj = new Block();
        display();
    }
}
