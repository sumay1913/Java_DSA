import java.util.Scanner;

public class if_else_ladder_example_2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter x axis: ");
    int a = sc.nextInt();
    System.out.print("Enter y axis: ");
    int b = sc.nextInt();
    if(a > 0 && b > 0)
    {
     System.out.println("point is in 1st quadrant");
    }
     else if(a < 0 && b > 0)
    {
     System.out.println("point is in 2nd quadrant");
    }
    else if(a < 0 && b < 0)
    {
     System.out.println("point is in 3rd quadrant");
    }
     else if(a > 0 && b < 0)
    {
     System.out.println("point is in 4th quadrant");
    }
      else 
    {
     System.out.println("point is at origin");
    }
   sc.close();
}
}
