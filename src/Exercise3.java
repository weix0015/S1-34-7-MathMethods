import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please type total numbers of seconds: ");
        int totalSeconds = in.nextInt();
        int p1 = totalSeconds % 60;
        int p2 = totalSeconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( p2 + " timer " + p3 + " minutter " + p1 + " sekunder");
        System.out.print("\n");

    }
}
