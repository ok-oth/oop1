package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to your admission test\n"+
                "Start by entering your KCSE grades");
        Scanner scanner= new Scanner(System.in);
        int kcse_grades=scanner.nextInt();
        if(kcse_grades>=65){
            System.out.println("Congratulations\n"+
                    "Enter your interview score(1-10)");
            int inter_scores= scanner.nextInt();
            if (inter_scores>=6){
                System.out.println("GREAT one more to go\n"+
                        "Enter your confidence level score(1-10)");
                int conf_scores= scanner.nextInt();
                //two conditions :KCSE and interview are true
                if(conf_scores>=5){
                    System.out.println("You are admitted\n"+
                            "You have met all the requirements");
                }
                else System.out.println("You've been admitted\n" +
                        "You have met the Kcse and interview scores required");
                    int confidence =scanner.nextInt();
                    if (conf_scores>=5){
                        System.out.println(" You have been admitted\n"+
                                "You have achieved the Kcse and confidence requirements");
                    }
                    else{
                        //both confidence and interview scores are false
                        System.out.println("You have been rejected\n"+
                        "You failed bot your interview and confidence levels");
                    }

                }else{
                System.out.println("Sorry you didn't meet the set interview score"+
                        "please enter your confidence level score(1-10)");




            }
        }else{
            System.out.println("You have been rejected\n"+
                    "You have not met the Kcse requirement");
        }
    }
}
