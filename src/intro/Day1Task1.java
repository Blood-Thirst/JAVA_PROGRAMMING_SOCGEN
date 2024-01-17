package intro;

import java.util.Scanner;

public class Day1Task1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name please!!! :  ");
        String name = sc.nextLine();


        System.out.println("May i also know your hobby 1 :  ");
        String hobby1 = sc.nextLine();


        System.out.println("May i also know your hobby 2 :  ");
        String hobby2 = sc.nextLine();

        System.out.println("May i also know your address :  ");
        String address = sc.nextLine();

        System.out.println("Nice to meet you " + name + " , so your hobbies are " + hobby1 + " and " + hobby2 + ". And you live in " + address);


        //dont forget to close the scanner when done
        sc.close();
    }
}
