public class Videogioco extends ElementoCatalogo {

    private String piattaforma;

    public Videogioco(String titolo, int anno, String codice, String piattaforma) {
        super(titolo, anno, codice);
        this.piattaforma = piattaforma;
    }

    @Override
    public String descrivi() {
        return "Gioco per " + piattaforma;
    }

    @Override
    public String toString() {
        return super.toString() + " - Piattaforma: " + piattaforma;
    }
}