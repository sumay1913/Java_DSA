import java.util.Scanner;

public class real_no_example_2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble(); // a = 3.19
    int b = (int)a ; // typecasting , b = 3
    if(a - b == 0)
    {
        System.out.println("not an integer");
    }
    else{
       System.out.println("an integer"); 
    }
    sc.close();
   } 
}
