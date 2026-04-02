import java.util.Scanner;
public class FBFor{
    public static void main(String[] args) {
        Scanner fb = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = fb.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}