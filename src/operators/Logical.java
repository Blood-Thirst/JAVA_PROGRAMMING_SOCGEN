package operators;

public class Logical
{
    public static void main(String[] args){

        int x = 10 ;
        int y = 5 ;

        // just for simple relational operators
        //i will use boolean datatype to check true or false

        boolean condition1 = true;
        boolean condition2 = false;
        boolean result1 = condition1 && condition2; // Logical AND
        boolean result2 = condition1 || condition2; // Logical OR
        boolean result3 = !condition1;              // Logical NOT

        System.out.println("result1 AND operators --> True or False <---  :: " + result1);
        System.out.println("result2 OR operators--> True or False <---  :: " + result2);
        System.out.println("result3 Negation--> True or False <---  :: " + result3);
    }
}