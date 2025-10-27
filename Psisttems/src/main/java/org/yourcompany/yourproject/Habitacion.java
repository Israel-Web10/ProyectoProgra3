package org.yourcompany.yourproject;

public class Habitacion {
    private int numero;
    private String tipo;
    private double precio;
    private Reserva[] reservas;
    private int numeroDeReservas;


    public Habitacion(int numero, String tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioP = precioPorNoche;

        this.numeroDeReservas = 0;
    }

    public int getNumero() { 
        return numero;
    }
    public String getTipo() {
        return tipo; 
    }
    public Reserva[] getReservas() {
         return reservas; 
     }
    public int getNumeroDeReservas() { 
        return numeroDeReservas;
    }

    public boolean estaDisponible(String fechaEntrada, String fechaSalida) {
        for (int i = 0; i < numeroDeReservas; i++) {
            Reserva reserva = reservas[i];
            if (fechaEntrada.compareTo(reserva.getFechaSalida()) < 0 &&
                fechaSalida.compareTo(reserva.getFechaEntrada()) > 0) {
                return false;
            }
        }
        return true;
    }
    public void agregarReserva(Reserva reserva) {
        if (numeroDeReservas < MAX_RESERVAS) {
            reservas[numeroDeReservas] = reserva;
            numeroDeReservas++;
        } else {
            System.out.println("Error: No se pueden agregar más reservas a la habitación " + numero + ". Capacidad máxima alcanzada.");
        }
    }
    @Override
    public String toString() {
        return "Habitacion{" + "numero=" + numero + ", tipo='" + tipo + '\'' + '}';
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }
}