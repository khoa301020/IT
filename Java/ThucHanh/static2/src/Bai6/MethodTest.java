package Bai6;

public class MethodTest {
    public static int a=10;
    void display() {
        System.out.println("This is an instance method");
    }
    static void show() {
        System.out.println("This is a Static method");
    }

    public static void main(String[] args) {
        MethodTest obj = new MethodTest();
        System.out.println(a);
        obj.display();
    }
}
