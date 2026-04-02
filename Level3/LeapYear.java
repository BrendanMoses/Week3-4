import java.util.Scanner;
class LeapYear{
    public static void main(String[] args) {
        Scanner ly = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = ly.nextInt();
        if (year < 1582) {
            System.out.println("Not valid for Gregorian calendar");
        } else {
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }
    }
}