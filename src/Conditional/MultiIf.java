package Conditional;

import java.util.Scanner;

public class MultiIf
{
        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age :: ");
        int age = sc.nextInt();

        System.out.println("Do you have a membership?? (yes/no) :: ");
        String memStatus = sc.next().toLowerCase();

        if (age >= 60){
            System.out.println("You qualified for a senior citizen discount!!! ");
        }

        if (memStatus.equals("yes")){
            System.out.println("You qualified for a membership discount!!! ");
        }

        if (age >= 60 && memStatus.equals("yes")){
            System.out.println("You qualified for a senior citizen and membership extra discount!!! ");
        }

        if (age < 60 && !memStatus.equals("yes")){
            System.out.println("You qualified for NO discount!!! ");
        }

        sc.close();
    }

}
