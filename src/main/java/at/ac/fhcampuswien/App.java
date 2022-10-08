package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){

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

        final int NumberOfLines = 6;
        StringBuilder StarString;
        final char space = ' ';
        final char star = '*';

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

        // Bereich eingrenzen, in dem alle Chars auch wirklich sichtbar sind.
        Scanner scanner = new Scanner(System.in);
        final char firstAllowedAsciiSignForRhombus  = 33;   // = !
        final char lastAllowedAsciiSignForRhombus   = 126;  // = ~
        final char space                            = 32;

        System.out.print("h: ");
        int rhombusHeight = scanner.nextInt();

        int rhombusHeightHalf = (rhombusHeight / 2) + 1;

        System.out.print("c: ");
        char rhombusChar = scanner.next().charAt(0);

        // Kontrolle, ob alle anzuzeigenden Chars im "sichtbaren Bereich" sind.
        if((rhombusChar - (rhombusHeightHalf - 1)) < firstAllowedAsciiSignForRhombus ||
                (rhombusChar > lastAllowedAsciiSignForRhombus )){
            System.out.println("Invalid character Input!");
            return;
        }

        if(rhombusHeight % 2 == 0){
            System.out.println("Invalid number!");
            return;
        }

        boolean HalfRhombusHeightReached = false;
        for(int currentHorizontalLineValue = 1 ; currentHorizontalLineValue > 0 ; currentHorizontalLineValue++){
            StringBuilder CharString = new StringBuilder();

            // Die Anzahl der benötigten Leerzeichen ist indirekt proportional vom "currentHorizontalLineValue"
            for (int numberOfLeadingSpaces = rhombusHeightHalf - currentHorizontalLineValue; numberOfLeadingSpaces > 0; numberOfLeadingSpaces--){
                CharString.append(space);
            }

            boolean halfRhombusWidthReached = false;
            for (int CurrentVerticalPositionValue = 1 ; CurrentVerticalPositionValue > 0 ; CurrentVerticalPositionValue++){
                // Die Berechnung des jeweils zu verwendenden Chars ergibt sich aus
                    // Dem anfangs eingegebenen Char.
                    // Wobei mit steigendem "currentHorizontalLineValue" ein kleineres Char als "Start" in der Zeile verwendet werden muss
                    // und abhängig vom CurrentVerticalPositionValue, ein Char mit höherer Wertigkeit verwendet werden soll.
                char currentChar = (char) (rhombusChar - currentHorizontalLineValue + CurrentVerticalPositionValue);
                CharString.append(currentChar);

               if (CurrentVerticalPositionValue == (currentHorizontalLineValue)) halfRhombusWidthReached = true;
               if (halfRhombusWidthReached) CurrentVerticalPositionValue = CurrentVerticalPositionValue - 2;
            }
            System.out.println(CharString);

            if(currentHorizontalLineValue==rhombusHeightHalf) HalfRhombusHeightReached = true;
            if (HalfRhombusHeightReached) currentHorizontalLineValue = currentHorizontalLineValue-2;
        }
    }

    //todo Task 5
    public void marks(){

        Scanner scanner = new Scanner(System.in);
        int i=0;
        double sum = 0;
        int numberOfNegativeMarks = 0;

        boolean zeroHasBeenEntered = false;
        do{
            int currentValue = scanner.nextInt();
            System.out.print("Mark " + (i + 1) + ": ");
            switch (currentValue){
                case 0 : {
                    zeroHasBeenEntered = true;
                    i--;
                    break;
                }
                case 1 : {
                    sum += 1;
                    break;
                }
                case 2 : {
                    sum += 2;
                    break;
                }
                case 3 : {
                    sum += 3;
                    break;
                }
                case 4 : {
                    sum += 4;
                    break;
                }
                case 5 : {
                    sum += 5;
                    numberOfNegativeMarks++;
                    break;
                }
                default: {
                    System.out.println("Invalid mark!");
                    i--;
                    break;
                }
            }
            i++;
        }while(!zeroHasBeenEntered);
        if (i == 0) i = 1;
        double average = sum / i;
        System.out.println("Average: " + String.format("%.2f",average));
        System.out.println("Negative marks: " + numberOfNegativeMarks);

    }

    //todo Task 6
    public void happyNumbers(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        long numberToCheck = scanner.nextLong();
        long iteratedNumber;
        final int resultOfSadNumber = 4;
        final int resultOfHappyNumber = 1;

        do {
            iteratedNumber = 0;
            while(numberToCheck != 0){
                iteratedNumber += (long) Math.pow(numberToCheck % 10,2);
                numberToCheck /= 10;
            }
            numberToCheck = iteratedNumber;
        }while(iteratedNumber != resultOfSadNumber && iteratedNumber != resultOfHappyNumber);
        if (iteratedNumber == resultOfHappyNumber) System.out.println("Happy number!");
        else System.out.println("Sad number!");
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}