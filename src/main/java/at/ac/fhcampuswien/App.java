package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("");
        System.out.println("           __");
        System.out.println(" _(\\ |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("    \\___|----| | __");
        System.out.println("        \\ }{ /\\ )_ / _\\");
                System.out.println("        /\\__/\\ \\__O (__");
        System.out.println("(--/\\--) \\");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner var = new Scanner(System.in);

        int zahl1;
        int zahl2;
        int summe;

        zahl1 = var.nextInt();
        zahl2 = var.nextInt();

        summe = zahl1 + zahl2;
        System.out.println(summe);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        int tmp;
        int no1;
        int no2;
        Scanner var = new Scanner(System.in);

        System.out.println("Before Swap:");
        no1 = var.nextInt();
        System.out.print("x: ");
        no2 = var.nextInt();
        System.out.print("y: ");
        System.out.println("After Swap:");
        tmp = no1;
        no1 = no2;
        no2 = tmp;
        System.out.println("x: " + no1);
        System.out.println("y: " + no2);


    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}