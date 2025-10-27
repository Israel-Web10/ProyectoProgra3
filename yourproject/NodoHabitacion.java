package org.yourcompany.yourproject;

public class NodoHabitacion {
    private Habitacion habitacion;
    private NodoHabitacion siguiente;
    private NodoHabitacion anterior;

    public NodoHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public NodoHabitacion getSiguiente() {
        return siguiente;
    }

    public NodoHabitacion getAnterior() {
        return anterior;
    }

    public void setSiguiente(NodoHabitacion siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoHabitacion anterior) {
        this.anterior = anterior;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}