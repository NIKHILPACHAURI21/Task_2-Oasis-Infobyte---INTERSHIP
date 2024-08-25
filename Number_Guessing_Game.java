import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int InputNumber;
    public int maxAttempts = 5;
    public int attempts;


    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("A number has been chosen between 1 and 100.");
        System.out.println("Your task is to guesses the number within 5 attempts");
        System.out.println("You have only 3 Rounds\n");

        for (attempts = 0; attempts < maxAttempts; attempts++) {
            System.out.print("Attempts " + (attempts + 1) + " Enter your guess: ");

            Scanner sc = new Scanner(System.in);
            InputNumber = sc.nextInt();


            if (InputNumber == number) {
                System.out.println("Yes, You guess the correct number");
                break;

            } else if (InputNumber < number && attempts != maxAttempts - 1) {
                System.out.println("You guesses low...");

            } else if (InputNumber > number && attempts != maxAttempts - 1) {
                System.out.println("You guesses to high...");
            }
        }

            if (attempts == maxAttempts) {
                System.out.println("You have exhausted all " + maxAttempts + " attempts");
                System.out.println("The Secret number was " + number);
           }
        System.out.println("GAME OVER\n");
    }
}


public class Number_Guessing_Game {
    public static void main(String[] args) {
        for(int Round = 0; Round < 3; Round++) {
            System.out.println("Round " + (Round +1) + " Start");
            Game g = new Game();
        }
    }
}
