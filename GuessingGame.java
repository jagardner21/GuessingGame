//Jesse Gardner - This is my own work.


import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 10000!");

        int random = (int) (Math.random() * 10000);
        int counter = 0;
        int guess = input.nextInt();

        System.out.println(random);
        counter++;

        while (guess != random) {
            if (guess < random) {
                System.out.println("Nope, it's higher...");
                guess = input.nextInt();
                counter++;
            } else if (guess > random) {
                System.out.println("Nuh uh, it's lower...");
                guess = input.nextInt();
                counter++;
            }
        }
        System.out.println("Bingo! It only took you " + counter + " tries!");
    }
}
