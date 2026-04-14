public class Libro extends ElementoCatalogo {

    private String autore;

    public Libro(String titolo, int anno, String codice, String autore) {
        super(titolo, anno, codice);
        this.autore = autore;
    }

    @Override
    public String descrivi() {
        return "Libro di " + autore;
    }

    @Override
    public String toString() {
        return super.toString() + " - Autore: " + autore;
    }
}