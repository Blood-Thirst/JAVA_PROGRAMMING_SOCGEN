package intro;

public class Constants {

    //when we declare a Constant , we declare it outside the main class .
    //intro.Constants usually are named with capital letters
    public static final int MAX_VALUE = 100;
    public static final int B = 150;
    //final makes the variable a Constant


    public static void main(String[] args){
        int a = 10 ;
        // B = 200;
        //this is normal declaration of a variable and its value
        System.out.println("this is normal variable , a = "+a);
        System.out.println("this is Constant variable , B = " + B);
        System.out.println("this is another Constant , MAX_VALUE = " + MAX_VALUE);
    }

}
