import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de fila de atencion en caja ===");

        Queue<String> filaNormal = new LinkedList<>();
        Queue<String> filaPreferencial = new LinkedList<>();

        filaNormal.add("Cliente 1");
        filaNormal.add("Cliente 2");
        filaPreferencial.add("Adulto mayor - Cliente 3");
        filaNormal.add("Cliente 4");
        filaPreferencial.add("Embarazada - Cliente 5");

        // Se van atendiendo clientes hasta que ambas filas esten vacias
        while (!filaNormal.isEmpty() || !filaPreferencial.isEmpty()) {
            String atendido = atenderSiguiente(filaNormal, filaPreferencial);
            System.out.println("Atendiendo a: " + atendido);
        }
    }

    // TODO 1: si filaPreferencial NO esta vacia, atiende (poll) de ahi primero
    // TODO 2: si filaPreferencial esta vacia, atiende (poll) de filaNormal
    // TODO 3: si ambas estan vacias, devuelve null
    public static String atenderSiguiente(Queue<String> filaNormal, Queue<String> filaPreferencial) {
        return null; // reemplaza con la logica correcta
    }
}
