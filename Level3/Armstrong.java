import java.util.Scanner;
class Armstrong{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = a.nextInt();
        int original = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num = num / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}