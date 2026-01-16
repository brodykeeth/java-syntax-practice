import java.util.Scanner;

public class ComputeAvg {
        
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your 1st score");
    int exam1 = input.nextLine();

    System.out.println("Enter your 2nd score");
    int exam2 = input.nextLine();

    System.out.println("Enter your 3rd score");
    int exam3 = input.nextLine();

    System.out.println("Enter your 4th score");
    int exam4 = input.nextLine();

    System.out.println("Enter your 5th score");
    int exam5 = input.nextLine();

    int[] exams = {exam1, exam2, exam3, exam4, exam5};

    public double calcAverage(int [] exams) {
        int sum = 0;
        for int exam : exams) {
        sum += exam;
        }
        return (double) sum / exams.length;
    }
}
