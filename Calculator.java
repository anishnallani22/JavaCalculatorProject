import java.util.Scanner;
public class Calculator {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = scanner.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scanner.nextDouble();

		System.out.println("Sum: " + add(num1, num2));
		scanner.close();

	}
	public static double add(double a, double b){
		return a+b;
	}
}
