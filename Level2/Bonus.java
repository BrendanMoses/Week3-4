import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = b.nextDouble();
        System.out.print("Enter years of service: ");
        int years = b.nextInt();
        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("Bonus amount: " + bonus);
    }
}