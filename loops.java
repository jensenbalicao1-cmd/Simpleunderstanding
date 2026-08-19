package Prac;

import java.sql.ResultSet;

public class loops {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m"; // Clears the color
public static void looping(){


    System.out.println(RED + "STOP HERE, now read" + RESET);

    System.out.println("for(int i = 0 ; i < 10 ; i++) {\n" +
            "        System.out.println(i);\n");

    for(int i = 0 ; i < 10 ; i++) {
        System.out.print(i + ",");


    }



    System.out.printf(RED + "SCROLL UP MUNA!!!" + RESET );

        System.out.println( "as you can see, ang value sang i is 0, and then i < 10 then  i++ which means +1");
        System.out.println("so yung gagawin nyan is everytime when the value ng i is still lower than 10 it'll repeat over and over until mag 9");
    System.out.println("because 9 is actually 10 because nag start sa 0");
}
}
