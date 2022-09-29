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
        System.out.println("0123456789012345678901"+ System.lineSeparator() +
        "         __" + System.lineSeparator() +
        " _(\\    |@@|" + System.lineSeparator() +
        "(__/\\__ \\--/ __" + System.lineSeparator() +
        "   \\___|----|  |   __" + System.lineSeparator() +
        "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
        "       /\\__/\\ \\__O (__" + System.lineSeparator() +
        "      (--/\\--)    \\__/" + System.lineSeparator() +
        "      _)(  )(_" + System.lineSeparator() +
        "     `---''---`");
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

        int x;
        int y;
        Scanner var = new Scanner(System.in);

        System.out.println("Before Swap:");
        x = var.nextInt();
        System.out.print("x: ");
        y = var.nextInt();
        System.out.print("y: ");
        System.out.println("After Swap:");
        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("x: " + x);
        System.out.println("y: " + y);


    }

    //todo Task 6
    public void compareTwoNumbers(){

        int no1;
        int no2;

        Scanner var = new Scanner(System.in);

        System.out.print("n1: ");
        no1 = var.nextInt();

        System.out.print("n2: ");
        no2 = var.nextInt();

        if (no2 > no1){
            System.out.println("n2 > n1");
        }

        if (no1 > no2){
            System.out.println("n1 > n2");
        }

        if (no1 == no2){
            System.out.println("n1 == n2");
        }
        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        int no1;
        int no2;
        Scanner var = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        no1 = var.nextInt();

        if (no1 < 0 | no1 >= 100000){
            System.out.println("Invalid Revenue");
        }
        if (no1 >= 0 & no1 < 20000){
            System.out.println("Poor Sales Revenue");
        }
        if (no1 >= 20000 & no1 < 50000){
            System.out.println("Average Sales Revenue");
        }
        if (no1 >= 50000 & no1 < 80000){
            System.out.println("Good Sales Revenue");
        }
        if (no1 >= 80000 & no1 < 100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){

        int x;
        Scanner var = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        x = var.nextInt();

                switch (x){
                    case 1:
                        System.out.println("Your Commission Rate was set to 0.01");
                        break;
                    case 2:
                        System.out.println("Your Commission Rate was set to 0.02");
                        break;
                    case 3:
                        System.out.println("Your Commission Rate was set to 0.03");
                        break;
                    case 4:
                        System.out.println("Your Commission Rate was set to 0.04");
                        break;
                    default:
                        System.out.println("Your Commission Rate was set to 0.0");
                        break;



                }
    }

    //todo Task 9
    public void leapyear(){
        int x;
        Scanner var = new Scanner(System.in);
        System.out.print("Year: ");
        x = var.nextInt();



        if (x%4 == 0 & x%400 == 0){
            System.out.println("Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        int z2;
        int y;
        int z;
        int z1;
        int z3;
        int ges;

        Scanner var = new Scanner(System.in);
        System.out.print("Number: ");
        y = var.nextInt();

            z1 = y/100;
            z = y%100;
            z2 = z/10;
            z3 = z%10;


            ges = z3*100 + z2*10 + z1;
        System.out.println(ges);
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