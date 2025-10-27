package org.yourcompany.yourproject;

public class MulticolasReserva {
    private NodoColaReserva frenteSimple, finSimple;
    private int tamañoSimple;
    private NodoColaReserva frenteDoble, finDoble;
    private int tamañoDoble;

    private NodoColaReserva frenteSuite, finSuite;
    private int tamañoSuite;

    public void encolarSegunTipo(Reserva reserva, String tipo) {
        NodoColaReserva nuevo = new NodoColaReserva(reserva);
        switch (tipo.toLowerCase()) {
            case "simple" -> agregarCola(nuevo, tipo);
            case "doble" -> agregarCola(nuevo, tipo);
            case "suite" -> agregarCola(nuevo, tipo);
        }
    }

    private void agregarCola(NodoColaReserva nuevo, String tipo) {
        switch (tipo.toLowerCase()) {
            case "simple" -> {
                if (frenteSimple == null) frenteSimple = finSimple = nuevo;
                else { finSimple.setSiguiente(nuevo); finSimple = nuevo; }
                tamañoSimple++;
            }
            case "doble" -> {
                if (frenteDoble == null) frenteDoble = finDoble = nuevo;
                else { finDoble.setSiguiente(nuevo); finDoble = nuevo; }
                tamañoDoble++;
            }
            case "suite" -> {
                if (frenteSuite == null) frenteSuite = finSuite = nuevo;
                else { finSuite.setSiguiente(nuevo); finSuite = nuevo; }
                tamañoSuite++;
            }
        }
    }

    public Reserva desencolarSegunTipo(String tipo) {
        NodoColaReserva frente = switch (tipo.toLowerCase()) {
            case "simple" -> frenteSimple;
            case "doble" -> frenteDoble;
            case "suite" -> frenteSuite;
            default -> null;
        };
        if (frente == null) return null;
        Reserva r = frente.getReservaPendiente();

        switch (tipo.toLowerCase()) {
            case "simple" -> { frenteSimple = frenteSimple.getSiguiente(); tamañoSimple--; }
            case "doble" -> { frenteDoble = frenteDoble.getSiguiente(); tamañoDoble--; }
            case "suite" -> { frenteSuite = frenteSuite.getSiguiente(); tamañoSuite--; }
        }
        return r;
    }

    public int getTotalEnEspera() {
        return tamañoSimple + tamañoDoble + tamañoSuite;
    }

    public void mostrarEstadoColas() {
        System.out.println("Cola Simple: " + tamañoSimple);
        System.out.println("Cola Doble: " + tamañoDoble);
        System.out.println("Cola Suite: " + tamañoSuite);
    }
}