package EXE_07072024;

import java.util.Scanner;

public class lab19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter 1st number");
        Scanner scan = new Scanner(System.in);
        int number2 = scan.nextInt();
        System.out.println("Enter 2st number");
        if(number<number2)
        {
            System.out.println("Largest is"+number);
        } else if (number==number2)
        {
            System.out.println("Both are equal");
        }
else {
            System.out.println("Largest number is"+number2);
        }
    }
}
