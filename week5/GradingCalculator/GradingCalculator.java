import java.util.Scanner;

public class GradingCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("\nWhat was the grade of your first class? ");
        double grade1 = userInput.nextDouble();
        System.out.print("What was the grade of your second class? ");
        double grade2 = userInput.nextDouble();
        System.out.print("What was the grade of your third class? ");
        double grade3 = userInput.nextDouble();
        System.out.print("What was the grade of your fourth class? ");
        double grade4 = userInput.nextDouble();
        System.out.print("What was the grade of your fifth class? ");
        double grade5 = userInput.nextDouble();

        double aveGrade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;
        double gpa = 0.0;
        String letGrade = "";

        if (aveGrade >= 93.00) {
            letGrade = "A";
            gpa = 4.0;
        }
        else if (aveGrade >= 90.00) {
            letGrade = "A-";
            gpa = 3.67;
        }
        else if (aveGrade >= 87.00) {
            letGrade = "B+";
            gpa = 3.33;
        }
        else if (aveGrade >= 83.00) {
            letGrade = "B";
            gpa = 3.0;
        }
        else if (aveGrade >= 80.00) {
            letGrade = "B-";
            gpa = 2.67;
        }
        else if (aveGrade >= 77.00) {
            letGrade = "C+";
            gpa = 2.33;
        }
        else if (aveGrade >= 73.00) {
            letGrade = "C";
            gpa = 2.0;
        }
        else if (aveGrade >= 70.00) {
            letGrade = "C-";
            gpa = 1.67;
        }
        else if (aveGrade >= 60.00) {
            letGrade = "D";
            gpa = 1.0;
        }
        else if (aveGrade >= 0) {
            letGrade = "F";
            gpa = 0.0;
        }

        if (aveGrade > 100.0) {
            aveGrade = 100.0;
        }

        System.out.printf("\nAverage: %.2f.\n", aveGrade);
        System.out.printf("Letter Grade: %s.\n", letGrade);
        System.out.printf("GPA: %.2f.\n", gpa);
    }
}