import java.util.Random;
import java.util.Scanner;

public class GuessANumber2 {
  public static void main(String[] args) {
    int secretNumber;
    int guess;
    boolean keepGuessing = true;
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    secretNumber = random.nextInt(10) + 1;
    System.out.println("SECRET NUMBER: " + secretNumber);

    while (keepGuessing) {
      System.out.print("Please guess: ");
      guess = in.nextInt();
      if (guess == secretNumber) {
        System.out.println("Congrats!");
        keepGuessing = false;
      } else {
        System.out.println("Wrong!");
        if (guess > secretNumber) {
          System.out.println("You're too high.");
        } else {
          System.out.println("You're too low.");
        }
      }
    }
  }
}
