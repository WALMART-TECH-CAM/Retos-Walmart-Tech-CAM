public class Main {
    public static void main(String[] args) {
        System.out.println("=== Asignacion de turnos - Tienda ===");

        String[] empleados = {"Marta", "Luis", "Sofia", "Diego", "Karla", "Pedro", "Ana"};
        String[] turnos = {"Manana", "Tarde", "Noche"};

        asignarTurnos(empleados, turnos);
    }

    // TODO 1: para cada empleado, calcula que turno le toca usando el indice y el operador %
    // e imprime una linea con el formato: "<empleado> -> Turno: <turno>"
    public static void asignarTurnos(String[] empleados, String[] turnos) {
        // TODO: recorre empleados con un for, calcula turnoIndex = i % turnos.length
        // e imprime el empleado junto con turnos[turnoIndex]
    }
}
