
// Take the integer input and print the absolute value of the input.

import java.util.Scanner;

public class if_else_example_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if(a == -(a))   //(n>=0)
        { 
            System.out.println("Number is: " +a);
        }
        else {
            System.out.println("Number is: " +(-(a)));
        }
    sc.close();
    }
}
