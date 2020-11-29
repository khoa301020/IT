package Rectangle;

public class Rectangle {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private int b;

    public void Area() {
        int S=a*b;
        System.out.println(S);
    }

    public void Perimeter() {
        int P=(a+b)*2;
        System.out.println(P);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Rectangle obj2 = new Rectangle();
        obj.setA(9);
        obj.setB(18);
        obj.Area();
        obj.Perimeter();
        obj2.setA(4);
        obj2.setB(5);
        obj2.Area();
        obj2.Perimeter();
    }
}
