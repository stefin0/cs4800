import java.util.Scanner;

public class Dice {
    private int numberOfRolls;
    private int numOccurences[];
    public static final int NUM_FACES = 6;

    public Dice(int numberOfRolls) {
        this.numberOfRolls = numberOfRolls;
        this.numOccurences = new int[Dice.NUM_FACES];
    }

    public void roll() {
        for (int i = 0; i < this.numberOfRolls; i++) {
            int num = (int)(Math.random() * Dice.NUM_FACES);
            this.numOccurences[num]++;
        }
    }

    public void printStatistics() {
        for (int i = 0; i < Dice.NUM_FACES; i++) {
            System.out.print("THe number " + (i + 1) + " was rolled ");
            System.out.print(this.numOccurences[i] + " times ");
            double percentage = 100.0 * this.numOccurences[i] / this.numberOfRolls;
            System.out.println("(" + percentage + "%).");
        }
    }

    private static int getNumRolls() {
        System.out.print("How many rolls? ");
        Scanner scanner = new Scanner(System.in);
        int numRolls = scanner.nextInt();
        scanner.close();
        return numRolls;
    }

    public static void main(String[] args) {
        int numRolls = getNumRolls();
        Dice dice = new Dice(numRolls);
        dice.roll();
        dice.printStatistics();
    }
}
