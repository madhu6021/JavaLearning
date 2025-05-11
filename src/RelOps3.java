import java.util.Scanner;
/**
 * 
 * Write a program that reads the numbers a, b, c and checks if there's a pair of them that adds up to exactly 20.
 * Print true or false
 * 
 */
public class RelOps3 {
    public static void main(String[] args){
        //Define an object for class Scanner to get take in the input
        Scanner sc = new Scanner(System.in);

        //Take in three interger values
        System.out.println("Enter three integers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a + b) == 20 || (a +c) == 20 || (b + c) == 20);

        sc.close();
    }

}
