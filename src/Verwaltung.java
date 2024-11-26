package src;

import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;
    private Caesar caesar;
    private Viginere viginere;

    public static void main(String[] args) {
        new Verwaltung();
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] verschluesseln");
            System.out.println("[2] entschluesseln");
            System.out.println("[3] viginere verschluesseln");
            System.out.println("[4] viginere entschluesseln");

            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Gib das Wort an, welches Sie verschluesseln wollen:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüssel an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                caesar = new Caesar();
                this.caesar.setKt(zeichenkette);
                this.caesar.setS(schluessel);
                this.caesar.verschluesseln();
                System.out.println(this.caesar.getGt());
            }else if (option == 2) {
                System.out.println("Gib das Wort an, welches Sie entschluesseln wollen:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüssel an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                caesar = new Caesar();
                this.caesar.setGt(zeichenkette);
                this.caesar.setS(schluessel);
                this.caesar.entschluesseln();
                System.out.println(this.caesar.getKt());
            }
            if (option == 3) {
                System.out.println("Gib das Wort an, welches Sie viginere verschluesseln wollen:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüssel an:");
                String schluesselString = scanner.nextLine();
                String schluessel = (schluesselString);
                viginere = new Viginere();
                this.viginere.setKt(zeichenkette);
                this.viginere.setS(schluessel);
                this.viginere.verschluesseln();
                System.out.println(this.viginere.getGt());
            }else if (option == 4) {
                System.out.println("Gib das Wort an, welches Sie viginere entschluesseln wollen:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüssel an:");
                String schluesselString = scanner.nextLine();
                String schluessel = (schluesselString);
                viginere = new Viginere();
                this.viginere.setGt(zeichenkette);
                this.viginere.setS(schluessel);
                this.viginere.entschluesseln();
                System.out.println(this.viginere.getKt());
            }
        }
    }
}