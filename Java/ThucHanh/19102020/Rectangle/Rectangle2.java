package Rectangle;
public class Rectangle2 {
    public int Area(int a, int b) {
        return a*b;
    }
    public int Perimeter(int a, int b) {
        return (a+b)*2;
    }
    public static void main(String[] args) {
        Rectangle2 dt1 = new Rectangle2();
        Rectangle2 dt2 = new Rectangle2();
        System.out.println("Dien tich hinh chu nhat la: "+dt1.Area(15,6));
        System.out.println("Chu vi hinh chu nhat la: "+dt1.Perimeter(15,6));
        System.out.println("Dien tich hinh chu nhat la: "+dt2.Area(10,3));
        System.out.println("Chu vi hinh chu nhat la: "+dt2.Perimeter(10,3));
    }
}