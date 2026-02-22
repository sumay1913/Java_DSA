import java.util.Scanner;



/* Print this pattern
12345
12345
12345
12345
*/

public class printing_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("enter n: ");
    int n = sc.nextInt();
    for(int i = 1 ; i<=n ; i++){
        for(int j = 1 ; j<=n ;j++){
            System.out.print(j+" ");
        }
        
         System.out.println();
    }
    sc.close();
 }   
}
  
    