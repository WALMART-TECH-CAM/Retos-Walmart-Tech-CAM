public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gestion de empleados - RH Regional ===");

        Empleado emp1 = new Empleado("Marta Diaz", 2018, 22000.0);

        int antiguedad = emp1.calcularAntiguedad(2026);
        System.out.println(emp1.getNombre() + " tiene " + antiguedad + " anios de antiguedad.");

        emp1.aumentarSalario(30); // deberia limitarse a 20%
        System.out.printf("Salario despues de intento de aumento del 30%%: $%.2f%n", emp1.getSalario());

        emp1.aumentarSalario(-10); // no deberia cambiar nada
        System.out.printf("Salario despues de intento de aumento negativo: $%.2f%n", emp1.getSalario());
    }
}

class Empleado {
    private String nombre;
    private int anioIngreso;
    private double salario;

    public Empleado(String nombre, int anioIngreso, double salario) {
        this.nombre = nombre;
        this.anioIngreso = anioIngreso;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    // TODO 1: devuelve la antiguedad como (anioActual - anioIngreso)
    public int calcularAntiguedad(int anioActual) {
        return 0; // reemplaza con la logica correcta
    }

    // TODO 2: aplica un aumento de salario segun 'porcentaje'
    // reglas: si porcentaje es negativo, no hacer nada
    //         si porcentaje > 20, limitar el aumento a 20
    //         en otro caso, aplicar el porcentaje solicitado
    public void aumentarSalario(double porcentaje) {
        // TODO: implementa la logica descrita arriba y actualiza this.salario
    }
}
