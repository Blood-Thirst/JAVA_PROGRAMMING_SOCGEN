package operators;

public class Assignment
{
    public static void main(String[] args ){
        int num = 10 ;

        num += 5 ;
        // num = num + 5
        System.out.println("assigment num += 5 :: " + num);

        num -= 5 ;
        // num = num - 5
        System.out.println("assigment num -= 5 :: " + num);

        num *= 2 ;
        // num = num * 5
        System.out.println("assigment num *= 5 :: " + num);

        num /= 2 ;
        // num = num / 5
        System.out.println("assigment num /= 5 :: " + num);

        num %= 3 ;
        // num = num % 3
        System.out.println("assigment num %= 5 :: " + num);
    }
}