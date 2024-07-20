package EXE_07072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab17 {
    public static void main(String[] args) {
        //Maximum number between two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first_num = sc.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the second number");
        int second_num = scan.nextInt();
        if(first_num>second_num)
        {
            System.out.println("The largest Number is"+ first_num);
        }
        else {
            System.out.println("The largest number is"+ second_num);
        }
    }
}
