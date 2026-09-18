import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Reporte agregado de ventas por sucursal ===");

        ArrayList<Transaccion> transacciones = new ArrayList<>();
        transacciones.add(new Transaccion("Sucursal Norte", 450.0));
        transacciones.add(new Transaccion("Sucursal Sur", 1200.0));
        transacciones.add(new Transaccion("Sucursal Norte", 300.0));
        transacciones.add(new Transaccion("Sucursal Centro", 800.0));
        transacciones.add(new Transaccion("Sucursal Sur", 150.0));

        HashMap<String, Double> reporte = generarReporte(transacciones);

        for (Map.Entry<String, Double> entrada : reporte.entrySet()) {
            System.out.printf("%s: $%.2f%n", entrada.getKey(), entrada.getValue());
        }
    }

    // TODO 1: recorre 'transacciones' UNA sola vez y acumula el total por sucursal en un HashMap
    // Pista: usa reporte.getOrDefault(sucursal, 0.0) + monto
    public static HashMap<String, Double> generarReporte(ArrayList<Transaccion> transacciones) {
        HashMap<String, Double> reporte = new HashMap<>();

        // TODO: implementa la logica descrita arriba

        return reporte;
    }
}

class Transaccion {
    private String sucursal;
    private double monto;

    public Transaccion(String sucursal, double monto) {
        this.sucursal = sucursal;
        this.monto = monto;
    }

    public String getSucursal() {
        return sucursal;
    }

    public double getMonto() {
        return monto;
    }
}
