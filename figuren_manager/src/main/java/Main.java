import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char form;
        int eingabe1;
        int eingabe2;
        int eingabe3;
        Figure figure;

        System.out.println("Welche Figur wollen sie berechnet haben? (Geben sie nur den Anfangsbuchstaben ein!)");
        form = sc.next().charAt(0);


        switch (form) {
            case 'e':
            case 'E':
                System.out.print("Ellipse mit Hauptachse ");
                eingabe1 = sc.nextInt();
                System.out.print(" und Nebenachse ");
                eingabe2 = sc.nextInt();
                System.out.print(":");
                figure = new Ellipse(eingabe1, eingabe2);
                System.out.print(figure.output());
                break;
            case 'q':
            case 'Q':
                System.out.print("Quadrat mit Seitenlänge ");
                eingabe1 = sc.nextInt();
                System.out.print(":");
                figure = new Square(eingabe1);
                System.out.println(figure.output());
                break;
            case 'k':
            case 'K':
                System.out.print("Kreis mit Radius ");
                eingabe1 = sc.nextInt();
                System.out.print(":");
                figure = new Circle(eingabe1);
                System.out.println(figure.output());
                break;
            case 'd':
            case 'D':
                System.out.print("Dreieck mit Seite 1 ");
                eingabe1 = sc.nextInt();
                System.out.print(", Seite 2 ");
                eingabe2 = sc.nextInt();
                System.out.print(" und eingeschlossenem Winkel ");
                eingabe3 = sc.nextInt();
                System.out.print(":");
                figure = new Triangle(eingabe1, eingabe2, eingabe3);
                System.out.println(figure.output());
                break;
            case 'r':
            case 'R':
                System.out.print("Rechteck mit Seite 1 ");
                eingabe1 = sc.nextInt();
                System.out.print(", Seite 2 ");
                eingabe2 = sc.nextInt();
                System.out.print(":");
                figure = new Rectangle(eingabe1, eingabe2);
                System.out.println(figure.output());
        }


    }


}

