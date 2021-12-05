import java.util.Scanner;

public class App {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("What number? ");
        System.out.print("Enter max number: ");
        int range = scanner.nextInt();
        playLevel(range);
        scanner.close();
    }

    private static void playLevel(int range) {
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Enter number from 0 to " + range);
            int x = scanner.nextInt();
            if (x == number) {
                System.out.println("Your number right!");
                break;
            } else if (x < number) {
                System.out.println(x + " is wrong. Your number is smaller.");
            } else {
                System.out.println(x + " is wrong. Your number is bigger.");
            }
        }
    }
}
