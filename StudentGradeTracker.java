import java.util.Scanner;
public class StudentGradeTracker 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        
        int[] grades = new int[numStudents];

        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }


        double average = calculateAverage(grades);
        int highestGrade = calculateHighest(grades);
        int lowestGrade = calculateLowest(grades);

        
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);

        scanner.close();
    }

    
    public static double calculateAverage(int[] grades) {
        double sum = 0;
        for (int i=0;i<grades.length;i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    
    public static int calculateHighest(int[] grades) {
        int highest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }
        return highest;
    }

    public static int calculateLowest(int[] grades) {
        int lowest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        return lowest;
    }
}
