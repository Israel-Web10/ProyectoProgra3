package org.yourcompany.yourproject;

public class NodoCliente {
    private Cliente cliente;
    private NodoCliente siguiente;
    private NodoCliente anterior;

    public NodoCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public NodoCliente getSiguiente() {
        return siguiente;
    }

    public NodoCliente getAnterior() {
        return anterior;
    }

    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoCliente anterior) {
        this.anterior = anterior;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}