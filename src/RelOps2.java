import java.util.Scanner;

/**
 * Program that takes Alice's and Bob's ages as input and determines whether Alice is older, younger, or the same age as Bob.
 * 
 * 
 */
public class RelOps2 {
    public static void main(String[] args){
        //Declare an object of class Scanner to take in the input from user
        Scanner sc = new Scanner(System.in);

        //Get Alice's and Bob's age
        int aliceAge = sc.nextInt();
        int bobAge = sc.nextInt();

        String companrisonResult;

        if (aliceAge > bobAge){
            companrisonResult = "older than";
        } else if (aliceAge < bobAge){
            companrisonResult = "younger than";
        } else {
            companrisonResult = "the same age as";
        }

        System.out.println("Alice is " +  companrisonResult + " Bob.");

        sc.close();
    }

}
