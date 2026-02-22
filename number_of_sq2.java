import java.util.Scanner;

public class number_of_sq2 {


/* Print this pattern
1111
2222
3333
4444
5555
6666
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("enter n: ");
    int n = sc.nextInt();
    for(int i = 1 ; i<=n ; i++){
        for(int j = 1 ; j<=n ;j++){
            System.out.print(i+" ");
        }
        
         System.out.println();
    }
    sc.close();
 }   
}
  
