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
            return;
        }

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
        final int NumberOfLines = 6;
        StringBuilder StarString;
        char space = ' ';
        char star = '*';
        // Die Anzahl der Leerzeichen wird mit jeder Zeile um eines Weniger.
        // Die Sterne werden mit jeder Zeile um 2 mehr.
        for(int i=1 ; i<=NumberOfLines ; i++){
            StarString = new StringBuilder();
            // Es wird 1 zu j dazu addiert, weil i mit 1 startet.
            for (int j = 5 - i + 1 ; j > 0; j--){
                StarString.append(space);
            }
            for (int k = 0 ; k < 2*i -1 ; k++){
                StarString.append(star);
            }
            System.out.println(StarString);
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        // Allgemeine Gedanken zur Übung :
            // Ich mache alles in einer Schleife.
                // Die Schleife beginnt bei 1 und die Laufbedingung ist, dass die Zahl größer 0 ist.
                // Was ist das obere Ende?
                    // Der (Eingabewert in INT : 2) + 1.
                        // Mit einer If- Bedingung frage ich ab, ob das erreicht wurde und setzte eine Boolean.
                // Die Boolean, welche gesetzt wird, wird am Ende der Schleife abgefragt
                    // Wenn diese $true ist, dann ziehe ich von der Laufvariable 2 ab.
        Scanner scanner = new Scanner(System.in);
        System.out.print("h:");
        int rhombusheight = scanner.nextInt();
        //if



        // Zwischenaufgabe : Flippen der Pyramide :
            final int NumberOfLines = 11;
            StringBuilder StarString;
            char space = ' ';
            char star = '*';
            // Die Anzahl der Leerzeichen wird mit jeder Zeile um eines Weniger.
            // Die Sterne werden mit jeder Zeile um 2 mehr.
            for(int i=1 ; i<=NumberOfLines ; i++){
                StarString = new StringBuilder();
                // Es wird 1 zu j dazu addiert, weil i mit 1 startet.
                for (int j = 5 - i + 1 ; j > 0; j--){
                    StarString.append(space);
                }
                for (int k = 0 ; k < 2*i -1 ; k++){
                    StarString.append(star);
                }
                System.out.println(StarString);
            }


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

        //System.out.println("\nTask 2: Stairs");
        //exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        //System.out.println("\nTask 4: Raute");
        //exercise2.printRhombus();

        //System.out.println("\nTask 5: Notendurchschnitt");
        //exercise2.marks();

        //System.out.println("\nTask 6: Fröhliche Zahlen");
        //exercise2.happyNumbers();*/
    }
}