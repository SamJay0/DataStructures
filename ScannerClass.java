import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        // check for an integer input
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Invalid integer; please enter an integer: ");
        }
        int i = input.nextInt();
        input.close();
        System.out.println("hr");

    }
}