import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Radius of the circle: ");
       double r = sc.nextDouble();
       double area = 3.14*r*r;
       System.out.print("Area of the circle: ");
       System.out.println(area);
       sc.close();
    }
}
