public class Nodo<T> {
    T valore;
    Nodo<T> sinistra, destra;

    public Nodo(T valore) {
        this.valore = valore;
    }
}