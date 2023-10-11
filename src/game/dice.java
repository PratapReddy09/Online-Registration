package game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class dice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int systemnum = ThreadLocalRandom.current().nextInt(1, 7);
        System.out.println("Enter number between 1 to 6 :");
        int num=sc.nextInt();
         System.out.println("System genetated number :" + systemnum);
        if(systemnum==num){
            System.out.println("you guess current number:");
        }
        else{
            System.out.println("you did not guess current number:");
        }
    }
    
}
