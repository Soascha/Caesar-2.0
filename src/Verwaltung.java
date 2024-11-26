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
            System.out.println("");
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("-----------------------------------");
            System.out.println("[0] Anleitung");
            System.out.println("-----------------------------------");
            System.out.println("[1] Caesar Verschlüsselung");
            System.out.println("-----------------------------------");
            System.out.println("[2] Caesar Entschlüsselung");
            System.out.println("-----------------------------------");
            System.out.println("[3] Viginere Verschlüsselung");
            System.out.println("-----------------------------------");
            System.out.println("[4] Viginere Entschluesselung");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 0) {
                System.out.println("");
                System.out.println("Die Caesar Ver- und Entschlüsselung ver- und entschlüsselt jeden Buchstaben eines Wortes");
                System.out.println("mit einem festen Schlüssel (Zahl)");
                System.out.println("");
            } else {
                if (option == 1) {
                    System.out.println("Gib das Wort an, welches Sie mit Caesar verschluesseln wollen:");
                    String zeichenkette = scanner.nextLine();
                    System.out.println("Gib den Schlüssel an:");
                    String schluesselString = scanner.nextLine();
                    int schluessel = Integer.parseInt(schluesselString);
                    caesar = new Caesar();
                    this.caesar.setKt(zeichenkette);
                    this.caesar.setS(schluessel);
                    this.caesar.verschluesseln();
                    System.out.println(this.caesar.getGt());
                } else if (option == 2) {
                    System.out.println("Gib das Wort an, welches Sie Caesar entschluesseln wollen:");
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
                    System.out.println("Gib das Wort an, welches Sie Viginere verschluesseln wollen:");
                    String zeichenkette = scanner.nextLine();
                    System.out.println("Gib den Schlüssel an:");
                    String schluesselString = scanner.nextLine();
                    String schluessel = (schluesselString);
                    viginere = new Viginere();
                    this.viginere.setKt(zeichenkette);
                    this.viginere.setS(schluessel);
                    this.viginere.verschluesseln();
                    System.out.println(this.viginere.getGt());
                } else if (option == 4) {
                    System.out.println("Gib das Wort an, welches Sie Viginere entschluesseln wollen:");
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
}
