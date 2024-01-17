package Conditional;

import java.util.Scanner;

public class MultipleIfElse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score (0-100): ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        } else {
            System.out.println("Your score is: " + score);

            if (score >= 90) {
                System.out.println("Grade: A");
                System.out.println("Excellent work!");
            } else if (score >= 80) {
                System.out.println("Grade: B");
                System.out.println("Good job!");
            } else if (score >= 70) {
                System.out.println("Grade: C");
                System.out.println("You passed.");
            } else if (score >= 60) {
                System.out.println("Grade: D");
                System.out.println("You need improvement.");
            } else {
                System.out.println("Grade: F");
                System.out.println("Sorry, you failed.");
            }
        }
        sc.close();
    }
}