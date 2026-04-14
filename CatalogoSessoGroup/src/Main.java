import java.util.Scanner;

public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {

        BST<ElementoCatalogo> catalogo = new BST<>();
        Scanner sc = new Scanner(System.in);

        catalogo.inserisci(new Libro("1984", 1949, "1", "Orwell"));
        catalogo.inserisci(new Film("Titanic", 1997, "2", "Cameron"));
        catalogo.inserisci(new Videogioco("Minecraft", 2011, "3", "PC"));
        catalogo.inserisci(new Libro("Dune", 1965, "4", "Herbert"));
        catalogo.inserisci(new Film("Avatar", 2009, "5", "Cameron"));
        catalogo.inserisci(new Videogioco("FIFA 23", 2023, "6", "PS5"));
        catalogo.inserisci(new Libro("It", 1986, "7", "King"));
        catalogo.inserisci(new Film("Joker", 2019, "8", "Phillips"));
        catalogo.inserisci(new Videogioco("GTA V", 2013, "9", "PC"));
        catalogo.inserisci(new Libro("Harry Potter", 1997, "10", "Rowling"));

        int scelta;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Inserisci elemento");
            System.out.println("2. Visualizza catalogo");
            System.out.println("3. Cerca elemento");
            System.out.println("0. Esci");

            scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {

                case 1:
                    System.out.println("1=Libro  2=Film  3=Videogioco");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titolo: ");
                    String titolo = sc.nextLine();

                    System.out.print("Anno: ");
                    int anno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Codice: ");
                    String codice = sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Autore: ");
                        String autore = sc.nextLine();
                        catalogo.inserisci(new Libro(titolo, anno, codice, autore));
                    } else if (tipo == 2) {
                        System.out.print("Regista: ");
                        String regista = sc.nextLine();
                        catalogo.inserisci(new Film(titolo, anno, codice, regista));
                    } else if (tipo == 3) {
                        System.out.print("Piattaforma: ");
                        String piattaforma = sc.nextLine();
                        catalogo.inserisci(new Videogioco(titolo, anno, codice, piattaforma));
                    }
                    break;

                case 2:
                    System.out.println(ANSI_BLUE + "\n--- FILM ---" + ANSI_RESET);
                    catalogo.stampaPerTipo(Film.class);

                    System.out.println(ANSI_BLUE + "\n--- VIDEOGIOCHI ---" + ANSI_RESET);
                    catalogo.stampaPerTipo(Videogioco.class);

                    System.out.println(ANSI_BLUE + "\n--- LIBRI ---" + ANSI_RESET);
                    catalogo.stampaPerTipo(Libro.class);
                    break;

                case 3:
                    System.out.print("Inserisci titolo da cercare: ");
                    String t = sc.nextLine();

                    // creo oggetto finto per confronto
                    ElementoCatalogo temp = new Libro(t, 0, "", "");

                    if (catalogo.cerca(temp)) {
                        System.out.println("Elemento trovato!");
                    } else {
                        System.out.println("Non trovato");
                    }
                    break;
            }

        } while (scelta != 0);

        sc.close();
    }
}