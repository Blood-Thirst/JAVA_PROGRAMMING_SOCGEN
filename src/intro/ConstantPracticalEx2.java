package intro;

import java.util.Scanner;

public class ConstantPracticalEx2 {

        // practical constants are used in 2 senerio
        //1)when u cdont want any value to change in the program and stay constant
        //2)when you can define constant math value
        public static final double PI_VALUE = 3.142 ;

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);


            System.out.println("what is the radius of circle :  ");
            int radius = sc.nextInt();
            double area = PI_VALUE * radius * radius ;

            System.out.println("the area of circle  = " + area);
        }
}
