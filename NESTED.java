package Prac;

import java.util.Scanner;

public class NESTED {
    public static void nest() {

        Scanner sc = new Scanner(System.in);


        String Student1, student2;
        int inputs;
        int PassingGrade = 60;


      /* first is MGA CONTROL STRUCTURESS
      kayy meron if else pa lang ang na bal an may e code

/*
Experiment kamo dira para mas ma intindihan ninyo kay may mga laptop man kamo
 */

        //ARI NESTED IF ELSE ibig sabihin  maka if ka pa sa if and maka if ka sa else sang iban nga if
        System.out.println("ARIIIII NESTED IF ELSE, kag put inputs rn ");


        System.out.print("English: ");
        double input1 = sc.nextDouble();
        System.out.print("Math: ");
        double input2 = sc.nextDouble();
        System.out.print("Science: ");
        double input3 = sc.nextDouble();

        double total = (input1 + input2 + input3) / 5;
//if("condtion" kumbaga diri ka mag code sang true statement or imo nga conditon para ma print nya ang sa curly brackets nya)
        if (total > PassingGrade) {

            System.out.print(total);
            System.out.println("This FRICKING STUDENT PASSED BRUH,sanaol");

            //DITOOO IS YUNG NESTED IF ARII YUNG DUGTONG NG IF SA TAAS OR THE OTHER IF PARA SA ISA MO NGA IF
        } else if (total == 60 || total > 50) {
            System.out.print(total);
            System.out.println("Bobo.");

        } else if (total <= 40) {
            System.out.println(total);
            System.out.println("buhi pa ni?");
//ariii is ang imo false side ng if mo OR yung alternative print like "its kung hindi sya true then ito yung e print"


        } else {

            System.out.println("bro butanga man sang inputs");
        }
    }
}