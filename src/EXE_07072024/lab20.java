package EXE_07072024;

import java.util.Scanner;

public class lab20 {
    public static void main(String[] args) {
        //write a program that prints numbers from 1 to 100 for multiples of 3 print fizz instead of number,
        //multiples of 5 print buzz
for(int i=1;i<=100;i++)
{
    if (i% 3 == 0) {
        System.out.println("Fizz");
    }
    else if (i % 5 == 0) {
        System.out.println("Buzz");

    } else if ((i% 3 == 0) &&(i % 5 == 0))
    {
        System.out.println("Fizzbuzz");
    } else {
        System.out.println(i);

    }

}

    }
}
