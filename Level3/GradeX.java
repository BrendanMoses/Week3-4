import java.util.Scanner;
class GradeX{
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int p = g.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int c = g.nextInt();
        System.out.print("Enter Maths marks: ");
        int m = g.nextInt();
        double avg = (p + c + m) / 3.0;
        char grade;
        String remarks;
        if (avg >= 80) {
            grade = 'A';
            remarks = "Level 4, above standards";
        } else if (avg >= 70) {
            grade = 'B';
            remarks = "Level 3, at standards";
        } else if (avg >= 60) {
            grade = 'C';
            remarks = "Level 2, approaching standards";
        } else if (avg >= 50) {
            grade = 'D';
            remarks = "Level 1, below standards";
        } else if (avg >= 40) {
            grade = 'E';
            remarks = "Too below standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}