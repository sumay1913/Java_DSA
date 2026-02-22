import java.util.Scanner;
/*
1
AB
123
ABCD
12345
 */

public class priting_example3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Numbers lines (1, 3, 5 ...)
        for(int i = 1; i <= n; i += 2){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Alphabet lines (2, 4 ...)
        for(int i = 2; i <= n; i += 2){
            for(int j = 1; j <= i; j++){
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}