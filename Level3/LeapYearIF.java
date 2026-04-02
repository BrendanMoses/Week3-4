import java.util.Scanner;
class LeapYearIF{
    public static void main(String[] args) {
        Scanner ly = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = ly.nextInt();
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}