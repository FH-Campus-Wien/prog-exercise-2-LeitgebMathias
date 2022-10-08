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

        // Enclose possible Char Range to a optically visible one.
        final char firstAllowedAsciiSignForRhombus  = 33;   // = !
        final char lastAllowedAsciiSignForRhombus   = 126;  // = ~

        final char space                            = 32;

        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int rhombusHeight = scanner.nextInt();

        // Half of Rhombus Height is necessary for following loops.
        int rhombusHeightHalfForLoop = (rhombusHeight / 2) + 1;

        System.out.print("c: ");
        char rhombusChar = scanner.next().charAt(0);
        // Controlling, if Chars that are going to be used, are in defined Char-Range.
            // rhombusHalfForLoops get subtracted by 1, because
            // the minimal Char that will be used is
                // rhombusChar - the "rounded down" half of the rhombusheight.
        if((rhombusChar - (rhombusHeightHalfForLoop - 1)) < firstAllowedAsciiSignForRhombus ||
                (rhombusChar > lastAllowedAsciiSignForRhombus )){
            System.out.println("Invalid character Input!");
            return;
        }

        if(rhombusHeight % 2 == 0){
            System.out.println("Invalid number!");
            return;
        }

        boolean HalfRhombusHeightReached = false;
        // "currentHorizontalLineValue" wird durchgehend hochgezählt.
            // Sobald "currentHorizontalLineValue" allerdings über der Hälfte der Höhe vom Rhombus ist, wird
            // "currentHorizontalLineValue" bei jedem Schleifendurchlauf um 1 reduziert ( + 1 -2 = -1).
                // Dadurch kann es überhaupt "0" werden.
        for(int currentHorizontalLineValue = 1 ; currentHorizontalLineValue > 0 ; currentHorizontalLineValue++){
            StringBuilder CharString = new StringBuilder();

            // Die Anzahl der benötigten Leerzeichen ist indirekt proportional vom "currentHorizontalLineValue"
            // Deshalb wird der Aktuell "Zeilenwert" von der Hälfte der Rhombushöhe abgezogen
            for (int numberOfLeadingSpaces = rhombusHeightHalfForLoop - currentHorizontalLineValue; numberOfLeadingSpaces > 0; numberOfLeadingSpaces--){
                CharString.append(space);
            }

            // Für die Schleife bezüglich der notwendigen Zeichen wurde das gleiche Prinzip, wie bei der Rhombushöhe verwendet.
                // In jeder Zeile wird "CurrentVerticalPositionValue" hochgezählt, bis die Vertikale Mitte des Rhombus überschritten ist.
                    // Ab dann wird "CurrentVerticalPositionValue" mit jedem Durchlauf um 1 reduziert ( + 1 -2 = -1), bis
                    // es letztendlich 0 ist.
            boolean halfRhombusWidthReached = false;
            for (int CurrentVerticalPositionValue = 1 ; CurrentVerticalPositionValue > 0 ; CurrentVerticalPositionValue++){
                // Die Berechnung des jeweils zu verwendenden Chars ergibt sich aus
                    // Dem anfangs eingegebenen Char.
                    // Wobei mit steigendem "currentHorizontalLineValue" ein kleineres Char als "Start" in der Zeile verwendet werden muss
                    // und abhängig vom CurrentVerticalPositionValue, ein Char mit höherer Wertigkeit verwendet werden soll.
                char currentChar = (char) (rhombusChar - currentHorizontalLineValue + CurrentVerticalPositionValue);

                CharString.append(currentChar);

                // Abfrage, ob die Vertikale mitte des Rhombus schon erreicht wurde.
                    // Die "Mitte" der auszugebenden Zeichen ist hier glücklicherweise immer auch genau "currentHorizontalLineValue"
                if (CurrentVerticalPositionValue == (currentHorizontalLineValue)) halfRhombusWidthReached = true;

                // Sobald die "Vertikale Mitte vom Rhombus" einmal erreicht wurde, wird die Laufvariable bei jedem Durchlauf reduziert, anstatt erhöht zu werden.
                if (halfRhombusWidthReached) CurrentVerticalPositionValue = CurrentVerticalPositionValue - 2;
            }
            System.out.println(CharString);

            // Abfrage, ob die Horizontale Mitte des Rhombus schon erreicht wurde.
            if(currentHorizontalLineValue==rhombusHeightHalfForLoop) HalfRhombusHeightReached = true;
            // Sobald die horizontale Mitte erreicht wurde, wird die Laufvariable bei jedem Durchlauf reduziert, anstatt erhöht zu werden.
            if (HalfRhombusHeightReached) currentHorizontalLineValue = currentHorizontalLineValue-2;
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

        //System.out.println("\nTask 3: Pyramide");
        //exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        //System.out.println("\nTask 5: Notendurchschnitt");
        //exercise2.marks();

        //System.out.println("\nTask 6: Fröhliche Zahlen");
        //exercise2.happyNumbers();*/
    }
}