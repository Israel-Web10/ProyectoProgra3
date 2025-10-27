package org.yourcompany.yourproject;

public class Reserva {
    private static int contador = 1;
    private int id;
    private Cliente cliente;
    private Habitacion habitacion;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    private double precioTotal;

    public Reserva(Cliente cliente, Habitacion habitacion, String fechaInicio, String fechaFin) {
        this.id = contador++;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = "Pendiente";
        this.precioTotal = calcularPrecioTotal();
    }

    public int getId() {
        return id;
    }

    public final double calcularPrecioTotal() {
        return habitacion.getPrecio(); // se puede ajustar con noches calculadas
    }

    public void confirmar() {
        this.estado = "Confirmada";
        habitacion.cambiarEstado("Ocupada");
    }

    public void cancelar() {
        this.estado = "Cancelada";
        habitacion.cambiarEstado("Disponible");
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", cliente=" + cliente.getDni() +
                ", habitacion=" + habitacion.getNumero() +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", estado='" + estado + '\'' +
                ", precioTotal=" + precioTotal +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}