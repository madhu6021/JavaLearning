import java.util.Scanner;
/**
 * 
 * Find the sum of numbers divisible by 6 in the given sequence of natural numbers.
 * The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.
 * 
 * 
 */
public class LoopOps1 {
    public static void main(String[] args){
        //define an object for Scanner class to take in the input
        Scanner sc = new Scanner(System.in);

        //Take total elements that user want to input
        int numOfElements = sc.nextInt();
        int sumOfElements = 0;

        //Loop to take in the elements
        for (int i = 1, a; i <= numOfElements; i++){
            a = sc.nextInt();
            sumOfElements += a % 6 == 0 ? a : 0;
        }

        System.out.println(sumOfElements);

        sc.close();
    }

}
