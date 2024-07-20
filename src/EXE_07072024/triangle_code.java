package EXE_07072024;

import java.util.Scanner;

public class triangle_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Side A");
        int side_a = sc.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of side B");
        int side_B = sc.nextInt();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of side C");
        int side_C = s.nextInt();
        if((side_a==side_B)&&(side_a==side_C))
        {
            System.out.println("Equilateral triangle");
        } else if ((side_a==side_B)||(side_a==side_C))
        {
            System.out.println("isosceles triangle");
        } else
        {
            System.out.println("The triangle is scalene triangle");
        }


    }
}
