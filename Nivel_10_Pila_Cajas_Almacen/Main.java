import java.util.Stack;

public class Main {
    static final int CAPACIDAD_MAXIMA = 5;

    public static void main(String[] args) {
        System.out.println("=== Control de pila de cajas - Almacen ===");

        Stack<String> pilaCajas = new Stack<>();

        apilar(pilaCajas, "Caja Detergente");
        apilar(pilaCajas, "Caja Cereal");
        apilar(pilaCajas, "Caja Refrescos");
        apilar(pilaCajas, "Caja Papel");
        apilar(pilaCajas, "Caja Aceite");
        apilar(pilaCajas, "Caja Extra"); // deberia ser rechazada (capacidad llena)

        retirar(pilaCajas);
        retirar(pilaCajas);

        System.out.println("Cajas restantes en la pila: " + pilaCajas.size());
    }

    // TODO 1: si pilaCajas.size() ya alcanzo CAPACIDAD_MAXIMA, imprime advertencia y no apiles
    // en otro caso, agrega (push) la caja e imprime confirmacion
    public static void apilar(Stack<String> pilaCajas, String nombreCaja) {
        // TODO: implementa la logica descrita arriba
    }

    // TODO 2: si pilaCajas esta vacia, imprime advertencia y devuelve null
    // en otro caso, retira (pop) la caja de hasta arriba, imprime cual se retiro y la devuelve
    public static String retirar(Stack<String> pilaCajas) {
        return null; // reemplaza con la logica correcta
    }
}
