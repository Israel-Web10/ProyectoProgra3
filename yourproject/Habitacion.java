package org.yourcompany.yourproject;

public class Habitacion {
    private int numero;
    private String tipo;
    private double precio;
    private String estado;
    private int capacidad;

    public Habitacion(int numero, String tipo, double precio, int capacidad) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.capacidad = capacidad;
        this.estado = "Disponible";
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return estado.equalsIgnoreCase("Disponible");
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", estado='" + estado + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}