package org.yourcompany.yourproject;

public class NodoReserva {
    private Reserva reserva;
    private NodoReserva siguiente;
    private NodoReserva anterior;

    public NodoReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public NodoReserva getSiguiente() {
        return siguiente;
    }

    public NodoReserva getAnterior() {
        return anterior;
    }

    public void setSiguiente(NodoReserva siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoReserva anterior) {
        this.anterior = anterior;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}