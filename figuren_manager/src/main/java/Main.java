import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char form;
        int eingabe1;
        int eingabe2;
        int eingabe3;
        String allfigures[] = new String[100];
        int i = 0;
        Figure figure;

        System.out.println("Welche Figur wollen sie berechnet haben? (Geben sie nur den Anfangsbuchstaben ein!) ");
        System.out.println("C = close; E = Ellipse; Q = Quadrat; K = Kreis; D = Dreieck; R = Rechteck; A = Ausgabe");
        form = sc.next().charAt(0);

        while(form != 'c' && form != 'C' ){

        switch (form) {
            case 'e':
            case 'E':
                System.out.print("Ellipse mit Hauptachse: ");
                eingabe1 = sc.nextInt();
                System.out.print("Nebenachse: ");
                eingabe2 = sc.nextInt();
                figure = new Ellipse(eingabe1, eingabe2);
                allfigures [i] = figure.output();
                i++;
                break;
            case 'q':
            case 'Q':
                System.out.print("Quadrat mit Seitenlänge: ");
                eingabe1 = sc.nextInt();
                figure = new Square(eingabe1);
                allfigures [i] = figure.output();
                i++;
                break;
            case 'k':
            case 'K':
                System.out.print("Kreis mit Radius: ");
                eingabe1 = sc.nextInt();
                figure = new Circle(eingabe1);
                allfigures [i] = figure.output();
                i++;
                break;
            case 'd':
            case 'D':
                System.out.print("Dreieck mit Seite 1: ");
                eingabe1 = sc.nextInt();
                System.out.print("Seite 2: ");
                eingabe2 = sc.nextInt();
                System.out.print("und eingeschlossenem Winkel: ");
                eingabe3 = sc.nextInt();
                figure = new Triangle(eingabe1, eingabe2, eingabe3);
                allfigures [i] = figure.output();
                i++;
                break;
            case 'r':
            case 'R':
                System.out.print("Rechteck mit Seite 1: ");
                eingabe1 = sc.nextInt();
                System.out.print("Seite 2: ");
                eingabe2 = sc.nextInt();
                figure = new Rectangle(eingabe1, eingabe2);
                allfigures [i] = figure.output();
                i++;
                break;
            case 'a':
            case 'A':

                System.out.printf("\nDatenanzeige: \n-------------\n");

                for (int j = 0; j < i; j++) {
                    System.out.println(allfigures[j]);
                }
                System.out.println();
                break;
            default:
                System.out.println("Falsche Eingabe!");
                System.out.println("C = close; E = Ellipse; Q = Quadrat; K = Kreis; D = Dreieck; R = Rechteck; A = Ausgabe");
        }

            System.out.println("Welche Figur wollen sie berechnet haben? (Geben sie nur den Anfangsbuchstaben ein!)");
            form = sc.next().charAt(0);

    }

        System.out.printf("\nDatenanzeige: \n-------------\n");

        for (int j = 0; j < i; j++) {
            System.out.println(allfigures[j]);
        }

}

}

