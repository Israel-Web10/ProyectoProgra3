package org.yourcompany.yourproject;

public class MultiPilaHistorial {
    private NodoPilaHistorial topeReservas;
    private int tamañoReservas;
    private NodoPilaHistorial topeCancelaciones;
    private int tamañoCancelaciones;
    private NodoPilaHistorial topeModificaciones;
    private int tamañoModificaciones;

    public MultiPilaHistorial() {
        this.topeReservas = null;
        this.tamañoReservas = 0;
        this.topeCancelaciones = null;
        this.tamañoCancelaciones = 0;
        this.topeModificaciones = null;
        this.tamañoModificaciones = 0;
    }

    private String fechaActual() {
        return "N/A"; 
    }

    public void registrarReserva(String desc, int id) {
        NodoPilaHistorial nodo = new NodoPilaHistorial("Reserva", desc, fechaActual(), id);
        nodo.setSiguiente(topeReservas);
        topeReservas = nodo;
        tamañoReservas++;
    }

    public void registrarCancelacion(String desc, int id) {
        NodoPilaHistorial nodo = new NodoPilaHistorial("Cancelación", desc, fechaActual(), id);
        nodo.setSiguiente(topeCancelaciones);
        topeCancelaciones = nodo;
        tamañoCancelaciones++;
    }

    public void registrarModificacion(String desc, int id) {
        NodoPilaHistorial nodo = new NodoPilaHistorial("Modificación", desc, fechaActual(), id);
        nodo.setSiguiente(topeModificaciones);
        topeModificaciones = nodo;
        tamañoModificaciones++;
    }

    public String deshacerReserva() {
        if (topeReservas == null) return "Nada que deshacer";
        String msg = topeReservas.getDescripcion();
        topeReservas = topeReservas.getSiguiente();
        tamañoReservas--;
        return "Reserva deshecha: " + msg;
    }

    public String deshacerCancelacion() {
        if (topeCancelaciones == null) return "Nada que deshacer";
        String msg = topeCancelaciones.getDescripcion();
        topeCancelaciones = topeCancelaciones.getSiguiente();
        tamañoCancelaciones--;
        return "Cancelación deshecha: " + msg;
    }

    public String deshacerModificacion() {
        if (topeModificaciones == null) return "Nada que deshacer";
        String msg = topeModificaciones.getDescripcion();
        topeModificaciones = topeModificaciones.getSiguiente();
        tamañoModificaciones--;
        return "Modificación deshecha: " + msg;
    }

    public String verUltimaReserva() {
        return (topeReservas == null) ? "Sin reservas" : topeReservas.getDescripcion();
    }

    public void mostrarHistorialCompleto() {
        System.out.println("=== HISTORIAL COMPLETO ===");
        mostrarHistorialPorTipo("reserva");
        mostrarHistorialPorTipo("cancelacion");
        mostrarHistorialPorTipo("modificacion");
    }

    public void mostrarHistorialPorTipo(String tipo) {
        NodoPilaHistorial actual;
         switch(tipo.toLowerCase()) {
            case "reserva":
                actual = topeReservas;
                break;
            case "cancelacion":
                actual = topeCancelaciones;
                break;
            case "modificacion":
                actual = topeModificaciones;
                break;
            default:
                actual = null;
        }

        System.out.println("\n--- Historial de " + tipo + " ---");
        while (actual != null) {
            System.out.println(actual.getDescripcion() + " (" + actual.getTipoOperacion() + ")");
            actual = actual.getSiguiente();
        }
    }

    public int getTamañoCancelaciones() {
        return tamañoCancelaciones;
    }

    public void setTamañoCancelaciones(int tamañoCancelaciones) {
        this.tamañoCancelaciones = tamañoCancelaciones;
    }

    public int getTamañoReservas() {
        return tamañoReservas;
    }

    public void setTamañoReservas(int tamañoReservas) {
        this.tamañoReservas = tamañoReservas;
    }

    public int getTamañoModificaciones() {
        return tamañoModificaciones;
    }

    public void setTamañoModificaciones(int tamañoModificaciones) {
        this.tamañoModificaciones = tamañoModificaciones;
    }
}