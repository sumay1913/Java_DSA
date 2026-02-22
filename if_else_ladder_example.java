import java.util.Scanner;

public class if_else_ladder_example {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length: ");
    int a = sc.nextInt();
    System.out.print("Enter the breadth: ");
    int b = sc.nextInt();
    if(a*b > 2*(a*b))
    {
        System.out.println("yes");
    }
    else {
        System.out.println("no");
    }
   sc.close(); 
}
}
