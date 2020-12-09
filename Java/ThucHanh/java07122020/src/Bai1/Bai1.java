package Bai1;
import java.util.Random;
import java.util.Arrays;
public class Bai1 {
    public static Random rand = new Random();
    
    public int[] RandArrGen(int n, int range) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(range);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Random n va khoang gia tri");
        try {
            int n = (int)(Math.random() * (50 - (-50) + 1) + (-50));
            System.out.println("n = "+n);
            int range = (int)(Math.random() * (50 - (-50) + 1) + (-50));
            System.out.println("range = "+range);
            Bai1 obj = new Bai1();
            System.out.println(Arrays.toString(obj.RandArrGen(n,range)));
        }
        catch (Exception er) {
            System.out.println("\nNhap loi!");
        }
    }
}
