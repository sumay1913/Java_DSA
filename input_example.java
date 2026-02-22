import java.util.Scanner;

public class input_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        
        System.out.print("Square of he number: ");
        System.out.println(x*x);
        sc.close();


    }
    
}
