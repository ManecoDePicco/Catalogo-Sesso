public class BST<T extends Comparable<T>> {

    Nodo<T> radice;

    public void inserisci(T valore) {
        radice = inserisciRic(radice, valore);
    }

    private Nodo<T> inserisciRic(Nodo<T> nodo, T valore) {
        if (nodo == null) return new Nodo<>(valore);

        if (valore.compareTo(nodo.valore) < 0)
            nodo.sinistra = inserisciRic(nodo.sinistra, valore);
        else
            nodo.destra = inserisciRic(nodo.destra, valore);

        return nodo;
    }

    public void stampa() {
        stampaRic(radice);
    }

    private void stampaRic(Nodo<T> nodo) {
        if (nodo != null) {
            stampaRic(nodo.sinistra);
            System.out.println(nodo.valore);
            stampaRic(nodo.destra);
        }
    }
    public boolean cerca(T valore) {
        return cercaRic(radice, valore);
    }

    private boolean cercaRic(Nodo<T> nodo, T valore) {
        if (nodo == null) return false;

        if (valore.compareTo(nodo.valore) == 0)
            return true;

        if (valore.compareTo(nodo.valore) < 0)
            return cercaRic(nodo.sinistra, valore);
        else
            return cercaRic(nodo.destra, valore);
    }

    public void stampaPerTipo(Class<?> tipo) {
        stampaPerTipoRic(radice, tipo);
    }

    private void stampaPerTipoRic(Nodo<T> nodo, Class<?> tipo) {
        if (nodo != null) {
            stampaPerTipoRic(nodo.sinistra, tipo);

            if (tipo.isInstance(nodo.valore)) {
                System.out.println(nodo.valore);
            }

            stampaPerTipoRic(nodo.destra, tipo);
        }
    }
}