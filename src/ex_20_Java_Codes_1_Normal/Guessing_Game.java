package ex_20_Java_Codes_1_Normal;

import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int NumberToGuess = random.nextInt(101);
        System.out.println("Enter a Random Number from 0 to 100 : ");
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        while(true){
            guess = sc.nextInt();
            attempts++;

            if(guess > NumberToGuess) {
                System.out.println("Too High ! Try Again");
            }
            else if(guess < NumberToGuess)  {
                System.out.println("Too Low ! Try Again");
            }
            else{
                System.out.printf("Correct ! You Guessed it in %d attempts !",attempts);
                break;
            }
        }
    }
}
/*
OUTPUT:
Enter a Random Number from 0 to 100 :
50
Too High ! Try Again
40
Too High ! Try Again
20
Too Low ! Try Again
30
Too Low ! Try Again
35
Too High ! Try Again
31
Too Low ! Try Again
32
Too Low ! Try Again
33
Too Low ! Try Again
34
Correct ! You Guessed it in 9 attempts !
Process finished with exit code 0
 */