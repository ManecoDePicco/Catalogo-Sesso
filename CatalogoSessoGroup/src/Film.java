public class Film extends ElementoCatalogo {

    private String regista;

    public Film(String titolo, int anno, String codice, String regista) {
        super(titolo, anno, codice);
        this.regista = regista;
    }

    @Override
    public String descrivi() {
        return "Film di " + regista;
    }
    @Override
    public String toString() {
        return super.toString() + " - Regista: " + regista;
    }
}
