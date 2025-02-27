import java.util.Scanner;

public class NumberExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        scanner.close();

        try {
            if (num1 > num2) {
                throw new NumberGreaterException(num1, num2);
            }
            System.out.println(num1 + " <= " + num2);
        } catch (NumberGreaterException err) {
            System.out.println(err.getMessage());
        }
    }
}

class NumberGreaterException extends Exception {
    public NumberGreaterException(int num1, int num2) {
        super("NumberGreaterException: " + num1 + " is greater than " + num2);
    }
}
