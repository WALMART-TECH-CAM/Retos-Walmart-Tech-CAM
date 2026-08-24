public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ranking regional de sucursales ===");

        Sucursal[] sucursales = {
                new Sucursal("Sucursal Reforma", 150000),
                new Sucursal("Sucursal Norte", 220000),
                new Sucursal("Sucursal Centro", 220000),
                new Sucursal("Sucursal Sur", 250000),
                new Sucursal("Sucursal Poniente", 190000)
        };

        ordenarPorVentas(sucursales);

        System.out.println("\nRanking final:");
        for (int i = 0; i < sucursales.length; i++) {
            System.out.println((i + 1) + ". " + sucursales[i].getNombre() + ": $" + sucursales[i].getVentas());
        }
    }

    // TODO 1: implementa el ordenamiento de mayor a menor venta.
    // TODO 2: si dos sucursales tienen las MISMAS ventas, deben quedar ordenadas alfabeticamente por nombre.
    // Pista: puedes usar sucursales[j].getNombre().compareTo(sucursales[j+1].getNombre())
    public static void ordenarPorVentas(Sucursal[] sucursales) {
        // TODO: implementa aqui tu algoritmo de ordenamiento (ej. Bubble Sort o Selection Sort)
    }
}

class Sucursal {
    private String nombre;
    private double ventas;

    public Sucursal(String nombre, double ventas) {
        this.nombre = nombre;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVentas() {
        return ventas;
    }
}
