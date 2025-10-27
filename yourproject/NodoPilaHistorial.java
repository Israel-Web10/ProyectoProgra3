package org.yourcompany.yourproject;

public class NodoPilaHistorial {
    private String tipoOperacion;
    private String descripcion;
    private String fechaHora;
    private int idRelacionado;
    private NodoPilaHistorial siguiente;

    public NodoPilaHistorial(String tipo, String desc, String fecha, int id) {
        this.tipoOperacion = tipo;
        this.descripcion = desc;
        this.fechaHora = fecha;
        this.idRelacionado = id;
    }

    public String getTipoOperacion() { return tipoOperacion; }
    public String getDescripcion() { return descripcion; }
    public NodoPilaHistorial getSiguiente() { return siguiente; }
    public void setSiguiente(NodoPilaHistorial siguiente) { this.siguiente = siguiente; }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getIdRelacionado() {
        return idRelacionado;
    }

    public void setIdRelacionado(int idRelacionado) {
        this.idRelacionado = idRelacionado;
    }
}