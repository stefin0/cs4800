import java.util.Scanner;

public class Fibonacci {
    private int fibNumber;
    private int num;

    public Fibonacci(int num) {
        this.num = num;
        this.fibNumber = fib(num);
    }

    private int fib(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public int getFibNumber() {
        return this.fibNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What Fibonacci number would you like? ");
        int num = scanner.nextInt();
        scanner.close();
        Fibonacci fibonacci = new Fibonacci(num);
        System.out.println("Fibonacci number " + num + " is " + 
                fibonacci.getFibNumber());
    }
}
