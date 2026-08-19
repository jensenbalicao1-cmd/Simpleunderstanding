
// IT SKILLS TO HAA!
// kag also may problem solivng ni (BAWAL AI AI)
// basic  codes lang ni


 package Prac;
import java.util.*;

public class Prac {
    public static final String RED = "\u001B[31m";
    public static void main() {
     Scanner sc = new Scanner(System.in);
 String [] codes = {"Loops ", "IF ELSE ","Methods","Do while"};
        System.out.println("Just fricking run the code bruh");
        for(int i = 0; i < codes.length ; i++){
            System.out.println("Choice "  + (i+1)  +": "+ codes[i] );
        }


        System.out.println("List of demo");

        System.out.print("Type Its number only :");
       int type = sc.nextInt();

       switch (type){

           case 1:
               loops.looping();
               break;
           case 2:

               NESTED.nest();
               break;
           case 3:
               System.out.println("coming soon");

           case 4:
               System.out.println("coming soon");


       }

    }

    }

