public abstract class ElementoCatalogo implements DescrizioneElemento, Comparable<ElementoCatalogo> {

    protected String titolo;
    protected int anno;
    protected String codice;

    public ElementoCatalogo(String titolo, int anno, String codice) {
        this.titolo = titolo;
        this.anno = anno;
        this.codice = codice;
    }
    @Override
    public int compareTo(ElementoCatalogo e) {
        return this.titolo.compareToIgnoreCase(e.titolo);
    }

    public abstract String descrivi();

    @Override
    public String toString() {
        return titolo + " (" + anno + ")";
    }
}