import java.util.Scanner;

public class pattern_printing {
 public static void main(String[] args) {
    // for(int i = 1 ; i<= 5 ; i++)
    // {
    //     System.out.println("* * * * * ");
    // }/
    Scanner sc = new Scanner(System.in);
     System.out.print("enter rows: ");
    int rows = sc.nextInt();
    //  System.out.print("enter columns: ");
    // int colmn = sc.nextInt();
    for(int i = 1 ; i<= rows ; i++){
        for(int j = 1 ; j<=rows ;j++){
            System.out.print("* ");
        }
        
         System.out.println();
    }
    sc.close();
 }   
}
