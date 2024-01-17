package Conditional;

import java.util.Scanner;

public class MultipleIfNested
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Have you completed a driver's education course? (yes/no): ");
        String driverEducation = scanner.next().toLowerCase();

        if (age >= 16) {
            System.out.println("You meet the minimum age requirement.");

            if (driverEducation.equals("yes")) {
                System.out.println("You have completed a driver's education course.");
                System.out.println("You are eligible for a driving license.");
            }

            if(driverEducation.equals("no")){
                System.out.println("Complete driver's education or no licence");
            }
        }

        if(age < 16){
            System.out.println("Sorry No License for you !!!");
        }
        scanner.close();
    }
}