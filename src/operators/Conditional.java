package operators;

public class Conditional
{
    public static void main(String[] args) {
        int age = 19;
        String vote = (age >= 18) ? "CanVote" : "CannotVote";

        System.out.println("Voting status :: " + vote);
    }
}