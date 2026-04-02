import java.util.Scanner;
public class Multi{
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = m.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}