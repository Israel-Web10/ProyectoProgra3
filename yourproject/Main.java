
package org.yourcompany.yourproject;


public class Main {
    public static void main(String[] args) {
        ListaDobleClientes listaClientes = new ListaDobleClientes();
        ListaDobleHabitaciones listaHabitaciones = new ListaDobleHabitaciones();
        ListaDobleReservas listaReservas = new ListaDobleReservas();
        MultiPilaHistorial historial = new MultiPilaHistorial();
        MulticolasReserva colaReservas = new MulticolasReserva();

        // === Crear Clientes ===
        Cliente c1 = new Cliente("Juan", "Pérez", "12345678A", "999888777", "juan@mail.com");
        Cliente c2 = new Cliente("Ana", "García", "87654321B", "666555444", "ana@mail.com");
        listaClientes.insertar(c1);
        listaClientes.insertar(c2);

        // === Crear Habitaciones ===
        Habitacion h1 = new Habitacion(101, "simple", 50.0, 1);
        Habitacion h2 = new Habitacion(102, "doble", 80.0, 2);
        Habitacion h3 = new Habitacion(201, "suite", 150.0, 4);
        listaHabitaciones.insertar(h1);
        listaHabitaciones.insertar(h2);
        listaHabitaciones.insertar(h3);

        System.out.println("=== Habitaciones ===");
        listaHabitaciones.listarTodas();

        // === Crear Reservas ===
        Reserva r1 = new Reserva(c1, h2, "2025-10-30", "2025-11-02");
        Reserva r2 = new Reserva(c2, h3, "2025-11-10", "2025-11-12");
        listaReservas.insertar(r1);
        listaReservas.insertar(r2);

        // === Confirmar y cancelar ===
        r1.confirmar();
        historial.registrarReserva("Reserva confirmada de " + c1.getDni(), r1.getId());
        r2.cancelar();
        historial.registrarCancelacion("Reserva cancelada de " + c2.getDni(), r2.getId());

        System.out.println("\n=== Reservas Activas ===");
        listaReservas.listarActivas();

        // === Mostrar historial ===
        System.out.println("\n=== Historial ===");
        historial.mostrarHistorialCompleto();

        // === Prueba de búsqueda ===
        System.out.println("\n=== Buscar habitaciones disponibles tipo 'doble' ===");
        Habitacion[] disponibles = listaHabitaciones.buscarDisponiblesPorTipo("doble");
        for (Habitacion h : disponibles) {
            System.out.println(h);
        }

        // === Colas ===
        colaReservas.encolarSegunTipo(r1, h2.getTipo());
        colaReservas.encolarSegunTipo(r2, h3.getTipo());
        System.out.println("\n=== Estado de las Colas ===");
        colaReservas.mostrarEstadoColas();
    }
}
