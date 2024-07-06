import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
    public static void main(String args[])
    {
        int min=1;
        int max=100;
        int score=0;
        char again;

        Scanner sc = new Scanner (System.in);
        Random obj1 = new Random();

        System.out.println("       ------Hi!! Welcome to Number Gaming-------");

        do{
            System.out.println("Enter the maximum number (1-100) :");
            max=sc.nextInt();
            while(max< 1|| max> 100)
            {
                System.out.println("Please enter a number between 1 and 100:");
                max = sc.nextInt();
            }


            System.out.println("Enter the minimum number as 1-100");
            min=sc.nextInt();
            while(min< 1|| min> 100 || min>= max)
            {
                System.out.println("Please enter a number between 1 and 100:");
                min = sc.nextInt();
            }


            int number = obj1.nextInt((max-min) +1) +min;
            int attemps = 0;
            boolean guessed = false;

            while(attemps<3 && !guessed)
            {
                System.out.println("Guess the number between " + min + " & " + max +" : ");
                int guess = sc.nextInt();
                attemps++;

                if(guess>number)
                {
                    System.out.println( " It is too high ");
                }

                else if(guess<number)
                {
                    System.out.println( " It is too low ");
                }

                else
                {
                    System.out.println(" It is a correct number ");
                    score++;
                    guessed = true;
                }
            }

            System.out.println( "  \n Random number was : " +number);

            System.out.println("Attempts :" +attemps);
            System.out.println("Score    :" +score);

            System.out.println("Do you need to run this game again? (Y/N) :");
            again = sc.next().charAt(0);


        }

        while(again == 'Y' || again == 'y');

    }
}

/*
class Random
{
    public int generateNum(int min, int max)
    {
        int number=(min +(int)(Math.Random() * ((max-min)+1)));
        return number;
    }
}*/

