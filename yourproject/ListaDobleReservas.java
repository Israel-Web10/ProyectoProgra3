package org.yourcompany.yourproject;

public class ListaDobleReservas {
    private NodoReserva cabeza;
    private NodoReserva cola;
    private int tamaño;

    public void insertar(Reserva reserva) {
        NodoReserva nuevo = new NodoReserva(reserva);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        tamaño++;
    }

    public Reserva buscarPorId(int id) {
        NodoReserva actual = cabeza;
        while (actual != null) {
            if (actual.getReserva().getId() == id) {
                return actual.getReserva();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public Reserva[] buscarPorCliente(String dni) {
        // 1️⃣ Contar cuántas reservas del cliente hay
        int contador = 0;
        NodoReserva actual = cabeza;
        while (actual != null) {
            Reserva r = actual.getReserva();
            if (r.toString().contains(dni)) {
                contador++;
            }
            actual = actual.getSiguiente();
        }

        // 2️⃣ Crear arreglo exacto
        Reserva[] resultado = new Reserva[contador];
        int i = 0;
        actual = cabeza;
        while (actual != null) {
            Reserva r = actual.getReserva();
            if (r.toString().contains(dni)) {
                resultado[i++] = r;
            }
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    public boolean eliminar(int id) {
        NodoReserva actual = cabeza;
        while (actual != null) {
            if (actual.getReserva().getId() == id) {
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

    public void listarActivas() {
        NodoReserva actual = cabeza;
        while (actual != null) {
            if (!actual.getReserva().getEstado().equalsIgnoreCase("Cancelada")) {
                System.out.println(actual.getReserva());
            }
            actual = actual.getSiguiente();
        }
    }

    public int getTamaño() {
        return tamaño;
    }
}