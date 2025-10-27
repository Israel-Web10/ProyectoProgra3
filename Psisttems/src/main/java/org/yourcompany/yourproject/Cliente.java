package org.yourcompany.yourproject;

public class Cliente {
    private String id;
    private String nombre;
    private String tipo;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Cliente{" + "id='" + id + '\'' + ", nombre='" + nombre + '\'' + '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}