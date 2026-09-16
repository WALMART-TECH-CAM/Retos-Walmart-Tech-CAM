import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Deteccion de SKUs duplicados - Carga de proveedor ===");

        int[] skusRecibidos = {1001, 1002, 1003, 1001, 1004, 1002, 1005, 1001};

        HashSet<Integer> duplicados = encontrarDuplicados(skusRecibidos);
        System.out.println("SKUs duplicados: " + duplicados);

        HashMap<Integer, Integer> conteo = contarOcurrencias(skusRecibidos);
        System.out.println("Conteo por SKU: " + conteo);
    }

    // TODO 1: recorre skusRecibidos usando un HashSet auxiliar de "ya vistos".
    // Si un SKU ya estaba en "vistos", agregalo al set de duplicados.
    public static HashSet<Integer> encontrarDuplicados(int[] skusRecibidos) {
        HashSet<Integer> vistos = new HashSet<>();
        HashSet<Integer> duplicados = new HashSet<>();

        // TODO: implementa la logica descrita arriba

        return duplicados;
    }

    // TODO 2: recorre skusRecibidos y lleva un contador por cada SKU en un HashMap
    // Pista: usa mapa.getOrDefault(sku, 0) + 1
    public static HashMap<Integer, Integer> contarOcurrencias(int[] skusRecibidos) {
        HashMap<Integer, Integer> conteo = new HashMap<>();

        // TODO: implementa la logica descrita arriba

        return conteo;
    }
}
