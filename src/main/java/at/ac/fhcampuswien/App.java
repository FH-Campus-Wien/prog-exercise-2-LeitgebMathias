package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        double MaxNumber = scanner.nextDouble();
        double Number;
        if(MaxNumber <= 0){
            System.out.println("No number entered.");
        } else {
            int i=2;
            do {
                System.out.print("Number " + i + ": ");
                Number = scanner.nextDouble();
                if (Number > 0){
                    if(Number > MaxNumber) MaxNumber = Number;
                    i++;
                }
            } while (Number > 0);
            System.out.println("The largest number is " + String.format("%.2f",MaxNumber));
        }
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int NumberOfLines = scanner.nextInt();
        if(NumberOfLines > 0) {
            int currentNumber = 1;
            for (int i = 1; i <=NumberOfLines; i++) {
                for (int j = 0; j < i; j++) {
                    if (j == i - 1) {
                        System.out.println(currentNumber + " ");
                    } else System.out.print(currentNumber + " ");
                    currentNumber++;
                }
            }
        } else System.out.println("Invalid number!");
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here

    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        //System.out.println("Task 1: Largest Number");
        //exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        /*System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();*/
    }
}