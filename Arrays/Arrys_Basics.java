import java.util.Scanner;

public class Arrys_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array: ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
         for(int i = 0 ; i < n ; i++){
           if(arr[i]<0) {
            System.out.println(arr[i]+" ");
           }
         }
         sc.close();
    }
}
