import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Pedidos pendientes - CEDIS ===");

        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(101, "Sucursal Norte", "Alta"));
        pedidos.add(new Pedido(102, "Sucursal Sur", "Media"));
        pedidos.add(new Pedido(103, "Sucursal Centro", "Baja"));

        Pedido encontrado = buscarPedidoPorId(pedidos, 102);
        if (encontrado != null) {
            System.out.println("Pedido encontrado: " + encontrado.getSucursal() + " (prioridad " + encontrado.getPrioridad() + ")");
        }

        completarPedido(pedidos, 101);
        completarPedido(pedidos, 999); // no existe

        System.out.println("Pedidos pendientes restantes: " + pedidos.size());
    }

    // TODO 1: recorre la lista y devuelve el Pedido cuyo id coincide con 'id'
    // si no lo encuentras, devuelve null
    public static Pedido buscarPedidoPorId(ArrayList<Pedido> pedidos, int id) {
        return null; // reemplaza con la logica correcta
    }

    // TODO 2: busca el pedido por id; si existe, eliminalo de la lista e imprime
    // "Pedido <id> completado y eliminado de pendientes."
    // si no existe, imprime "Pedido <id> no encontrado."
    public static void completarPedido(ArrayList<Pedido> pedidos, int id) {
        // TODO: implementa la logica descrita arriba
    }
}

class Pedido {
    private int id;
    private String sucursal;
    private String prioridad; // "Alta", "Media", "Baja"

    public Pedido(int id, String sucursal, String prioridad) {
        this.id = id;
        this.sucursal = sucursal;
        this.prioridad = prioridad;
    }

    public int getId() {
        return id;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getPrioridad() {
        return prioridad;
    }
}
