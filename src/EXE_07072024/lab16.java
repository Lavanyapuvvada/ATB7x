package EXE_07072024;

import java.util.Scanner;

public class lab16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int b = sc.nextInt();
        System.out.println(" Value of b is"+b);
        if(b%2==0)
        {
            System.out.println(" The entered number is even number");
        }
        else {
            System.out.println(" The entered number is odd number");
        }

    }
}
