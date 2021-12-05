import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter operation:");
        System.out.println("1. Increment");
        System.out.println("2. Decrement");
        System.out.println("3. Divide");
        System.out.println("4. Multiply");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.print("Enter first number: ");
        Scanner first = new Scanner(System.in);
        double a = first.nextInt();
        System.out.print("Enter second number: ");
        Scanner second = new Scanner(System.in);
        double b = second.nextInt();
        double result = 0;

        switch (operation) {
            case 1: result = a + b; break;
            case 2: result = a - b; break;
            case 3: result = a / b; break;
            default: result = a * b; break;
        }
        System.out.println("Result = " + result);
        
        scanner.close();
        first.close();
        second.close();
    }
}
