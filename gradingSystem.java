import java.util.Scanner;

public class gradingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your exam score: ");
        double examScore = input.nextDouble();
        boolean passedExams = examScore >= 25;

        System.out.println("Enter your assessment score: ");
        double assessmentScore = input.nextDouble();
        boolean passedAssessments = assessmentScore >= 15;

        System.out.println("Enter fees paid: ");
        double feesPaid = input.nextDouble();
        boolean paidFees = feesPaid >= 100;

        double totalScore = examScore + assessmentScore;

        System.out.println("=============================================");
        System.out.println("Exams: " + (passedExams ? "Passed" : "Failed"));
        System.out.println("Assessment: " + (passedAssessments ? "Passed" : "Failed"));
        System.out.println("Fees: " + (paidFees ? "Paid" : "Owing"));

        if (totalScore == 39) {
            System.out.println("You have been condoned!");
        } else if (!passedExams && !passedAssessments) {
            System.out.println("You have been repeated since you failed both exams and assessment!");
        } else if (!passedExams || !passedAssessments) {
            System.out.println("You have failed!");
        } else {
            if (paidFees) {
                System.out.println("You have been awarded a certificate!");
            } else {
                System.out.println("You cannot be awarded a certificate since your fees are due!");
            }
        }
        System.out.println("=============================================");

        input.close();
    }

}
