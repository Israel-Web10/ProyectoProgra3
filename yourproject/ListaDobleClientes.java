package org.yourcompany.yourproject;

public class ListaDobleClientes {
    private NodoCliente cabeza;
    private NodoCliente cola;
    private int tamaño;

    public void insertar(Cliente cliente) {
        NodoCliente nuevo = new NodoCliente(cliente);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        tamaño++;
    }

    public Cliente buscarPorDni(String dni) {
        NodoCliente actual = cabeza;
        while (actual != null) {
            if (actual.getCliente().getDni().equals(dni)) {
                return actual.getCliente();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public boolean eliminar(String dni) {
        NodoCliente actual = cabeza;
        while (actual != null) {
            if (actual.getCliente().getDni().equals(dni)) {
                if (actual == cabeza) cabeza = actual.getSiguiente();
                if (actual == cola) cola = actual.getAnterior();
                if (actual.getAnterior() != null)
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                if (actual.getSiguiente() != null)
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                tamaño--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public void listarAdelante() {
        NodoCliente actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getCliente());
            actual = actual.getSiguiente();
        }
    }

    public void listarAtras() {
        NodoCliente actual = cola;
        while (actual != null) {
            System.out.println(actual.getCliente());
            actual = actual.getAnterior();
        }
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int getTamaño() {
        return tamaño;
    }
}