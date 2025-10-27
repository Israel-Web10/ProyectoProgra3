package org.yourcompany.yourproject;

public class Cliente {
    private static int contador = 1;
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;

    public Cliente(String nombre, String apellido, String dni, String telefono, String email) {
        this.id = contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Cliente{" +"id=" + id +", nombre='" + nombre + '\'' +", apellido='" + apellido + '\'' +", dni='" + dni + '\'' +", telefono='" + telefono + '\'' +", email='" + email + '\'' +'}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
