/**
 * 
 * A bus tour of Europe has been very successful. Due to an increase in the number of people who want to go on a tour, 
 * the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.
 * But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges. 
 * Can you find out if this will happen?
 * 
 * The first line of the input contains the height of the bus and the number of bridges under which the bus passes. 
 * The second line contains the heights of these bridges.
 * 
 * You should output "Will not crash" if everything will be alright; otherwise, output "Will crash on bridge i" 
 * (where i is the number of the bridge) into which the bus will crash. If the height of a bridge equals the 
 * height of the bus, the bus will crash.
 * 
 * 
 */

import java.util.Scanner;


class Branching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //get height of bus and number of bridges
        int busHeight = scanner.nextInt();
        int bridgeCnt = scanner.nextInt();

        boolean willCrash = false;
        int bridgeNum = 0;

        for (int i = 1; i <= bridgeCnt; i++){
            //Get height of each bridge
            int bridgeHeight = scanner.nextInt();

            if (!willCrash){
                if (busHeight >= bridgeHeight){
                    willCrash = true;
                    bridgeNum = i;
                }
            }
        }

        if (willCrash){
            System.out.println("Will crash on bridge " + bridgeNum);
        } else {
            System.out.println("Will not crash");
        }

        scanner.close();

    }
}