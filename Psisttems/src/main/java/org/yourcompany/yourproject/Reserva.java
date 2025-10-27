package org.yourcompany.yourproject;

public class Reserva {
    private String idReserva;
    private Cliente cliente;
    private Habitacion habitacion;
    private String fechaEntrada;
    private String fechaSalida;

    public Reserva(Cliente cliente, Habitacion habitacion, String fechaEntrada, String fechaSalida) {
        this.idReserva = "RES-" + System.currentTimeMillis(); // ID único simple
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public String getIdReserva() {
         return idReserva; 
    }
    public Cliente getCliente() { 
        return cliente;
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }
    public String getFechaEntrada() { 
        return fechaEntrada; 
    }
    public String getFechaSalida() { 
        return fechaSalida; 
    }
    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id='" + idReserva + '\'' +", cliente=" + cliente.getNombre() +", habitacion=" + habitacion.getNumero() +", entrada='" + fechaEntrada + '\'' +", salida='" + fechaSalida + '\'' +'}';
    }
}