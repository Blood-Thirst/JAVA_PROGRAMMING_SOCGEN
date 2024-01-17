package operators;

public class Relational
{
    public static void main(String[] args)
    {
        int x = 10 ;
        int y = 5 ;

        // just for simple relational operators
        //i will use boolean datatype to check true or false

        boolean isEqual = x == y ;
        boolean isNotEqual = x != y; // Not equal to
        boolean isLess = x < y;      // Less than
        boolean isGreater = x > y;   // Greater than
        boolean isLessOrEqual = x <= y; // Less than or equal to
        boolean isGreaterOrEqual = x >= y; // Greater than or equal to

        System.out.println("isEqual --> True or False <---  :: " + isEqual);
        System.out.println("isNotEqual --> True or False <---  :: " + isNotEqual);
        System.out.println("isLess --> True or False <---  :: " + isLess);
        System.out.println("isGreater --> True or False <---  :: " + isGreater);
        System.out.println("isLessOrEqual --> True or False <---  :: " + isLessOrEqual);
        System.out.println("isGreaterOrEqual --> True or False <---  :: " + isGreaterOrEqual);
    }
}