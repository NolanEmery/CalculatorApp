import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Choose Add (A), Subtract (S), Multiply (M), or Divide (D): ");
            Scanner num1Scanner = new Scanner(System.in);
            int firstNumber;
            Scanner num2Scanner = new Scanner(System.in);
            int secondNumber;
            String nextInput = scanner1.nextLine();
            System.out.println("Enter first number: ");
            int result;
            firstNumber = num1Scanner.nextInt();
            System.out.println("Enter second number: ");
            secondNumber = num2Scanner.nextInt();
            if (nextInput.toLowerCase().equals("a")) {
                result = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + result);
            } else if (nextInput.toLowerCase().equals("s")) {
                result = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + result);
            } else if (nextInput.toLowerCase().equals("m")) {
                result = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + result);
            } else if (nextInput.toLowerCase().equals("d")) {
                result = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + result);
            } else {
                continue;
            }
            System.out.println("Continue (C) or Quit (Q)?");
            Scanner scanner2 = new Scanner(System.in);
            String input = scanner2.nextLine();
            if (input.toLowerCase().equals("q")) {
                System.exit(0);
            }
        }
    }
}
