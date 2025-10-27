package org.yourcompany.yourproject;

public class ListaDobleHabitaciones {
    private NodoHabitacion cabeza;
    private NodoHabitacion cola;
    private int tamaño;

    public void insertar(Habitacion habitacion) {
        NodoHabitacion nuevo = new NodoHabitacion(habitacion);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        tamaño++;
    }

    public Habitacion buscarPorNumero(int numero) {
        NodoHabitacion actual = cabeza;
        while (actual != null) {
            if (actual.getHabitacion().getNumero() == numero) {
                return actual.getHabitacion();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public Habitacion[] buscarDisponiblesPorTipo(String tipo) {
        // Contar cuántas disponibles hay
        int contador = 0;
        NodoHabitacion actual = cabeza;
        while (actual != null) {
            Habitacion h = actual.getHabitacion();
            if (h.getTipo().equalsIgnoreCase(tipo) && h.isDisponible()) {
                contador++;
            }
            actual = actual.getSiguiente();
        }

        Habitacion[] disponibles = new Habitacion[contador];
        int i = 0;
        actual = cabeza;
        while (actual != null) {
            Habitacion h = actual.getHabitacion();
            if (h.getTipo().equalsIgnoreCase(tipo) && h.isDisponible()) {
                disponibles[i++] = h;
            }
            actual = actual.getSiguiente();
        }
        return disponibles;
    }

    public boolean eliminar(int numero) {
        NodoHabitacion actual = cabeza;
        while (actual != null) {
            if (actual.getHabitacion().getNumero() == numero) {
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

    public void listarTodas() {
        NodoHabitacion actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getHabitacion());
            actual = actual.getSiguiente();
        }
    }

    public int getTamaño() {
        return tamaño;
    }
}