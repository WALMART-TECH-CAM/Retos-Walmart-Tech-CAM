public class Main {
    public static void main(String[] args) {
        System.out.println("=== Clasificacion de productos por departamento ===");

        int[] codigosRecibidos = {3, 1, 5, 9, 2, 4};

        for (int codigo : codigosRecibidos) {
            String departamento = obtenerDepartamento(codigo);
            System.out.println("Codigo " + codigo + " -> " + departamento);
        }
    }

    // TODO 1: implementa este metodo usando switch (no uses if/else if)
    // debe devolver el nombre del departamento segun las reglas del README
    public static String obtenerDepartamento(int codigo) {
        String departamento = "";
        // TODO: switch (codigo) { case 1: departamento = "..."; break; ... default: ... }
        return departamento;
    }
}
