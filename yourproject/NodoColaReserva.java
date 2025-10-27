package org.yourcompany.yourproject;

public class NodoColaReserva{
    private Reserva reservaPendiente;
    private NodoColaReserva siguiente;

    public NodoColaReserva(Reserva reserva) {
        this.reservaPendiente = reserva;
    }

    public Reserva getReservaPendiente() {
        return reservaPendiente;
    }

    public NodoColaReserva getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoColaReserva siguiente) {
        this.siguiente = siguiente;
    }

    public void setReservaPendiente(Reserva reservaPendiente) {
        this.reservaPendiente = reservaPendiente;
    }
}
