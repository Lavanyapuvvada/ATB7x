package EXE_07072024;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days in an year");
        int year = sc.nextInt();

        if(year==366)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    }
}
