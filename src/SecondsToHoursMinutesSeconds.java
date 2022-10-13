import java.util.Scanner;

public class SecondsToHoursMinutesSeconds {
  public static void main(String[] args) {
    final int secondsPerMinute = 60;
    final int minutesPerHour = 60;
    int totalSeconds;
    int hours;
    int minutes;
    int seconds;
    Scanner in = new Scanner(System.in);

    System.out.print("Please type total number of seconds: ");
    totalSeconds = in.nextInt();

    hours = totalSeconds / (minutesPerHour * secondsPerMinute);
    minutes = (totalSeconds - (hours * 3600)) / 60;
    seconds = totalSeconds - (hours * 3600) - (minutes * 60);

    System.out.println(totalSeconds + " seconds is " +
        hours + " hours, " +
        minutes + " minutes and " +
        seconds + " seconds.");
  }
}
