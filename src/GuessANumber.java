import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        int hiddenNumber;
        int guess;
        boolean guessAgain = true;
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        hiddenNumber = random.nextInt(10 + 1);
        System.out.println("HiddenNumber: " + hiddenNumber);

        while (guessAgain) {
            System.out.println("try guessing again");

        }
    }
}
