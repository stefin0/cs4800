import java.util.Scanner;

public class Operation {
    public static void main(String... args) {
        char operator = args[0].charAt(0);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = scanner.nextInt();

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 'x':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case '%':
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.out.println("Error: incompatible operator");
                break;
        }

        scanner.close();
    }
}
