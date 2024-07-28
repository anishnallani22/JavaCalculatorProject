import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();
        
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Sum: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Difference: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
}


