import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number? ");
        int range = 10;
        int number = (int) (Math.random() * range);

        while (true) {
            
            System.out.println("Enter number from 0 to " + range);
            int x = scanner.nextInt();
            if (x == number) {
                System.out.println("Your number right!");
                break;
            } else if (x < number) {
                System.out.println(x + " is wrong. Number is smaller.");
            } else {
                System.out.println(x + " is wrong. Number is bigger.");
            }
        }
        scanner.close();
    }
}
