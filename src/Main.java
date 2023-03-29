import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, x3, y1, y2, y3;
        double x;
        double y;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        x = (double)(x1+x2+x3)/3;
        y = (double)(y1+y2+y3)/3;
        System.out.printf("(%.1f, %.1f)",x,y);
    }
}