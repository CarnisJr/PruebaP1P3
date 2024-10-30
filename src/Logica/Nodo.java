package Logica;

public class Nodo {

    private Guerrero entrada;
    private Nodo next;

    public Nodo(Guerrero entrada, Nodo next) {

        this.entrada = entrada;
        this.next = next;
    }

    public Guerrero getEntrada() {
        return entrada;
    }

    public void setEntrada(Guerrero entrada) {
        this.entrada = entrada;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
