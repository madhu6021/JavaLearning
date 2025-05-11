import java.util.Scanner;

public class RelOps1 {
    public static void main(String[] args){
        // Create an object of Scanner class to read input from User
        Scanner sc = new Scanner(System.in);

        //Read two integers from User
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Compare both the values, if a is greater than b, print "TRUE" else "FALSE"
        if (a > b){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }


        sc.close();

    }

}
