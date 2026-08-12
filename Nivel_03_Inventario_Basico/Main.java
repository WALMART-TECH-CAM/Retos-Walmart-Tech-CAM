public class Main {
    public static void main(String[] args) {
        System.out.println("=== Reporte de inventario - Tienda ===");

        String[] productos = {"Leche", "Pan", "Arroz", "Detergente", "Aceite", "Huevo"};
        int[] stock = {40, 12, 55, 8, 30, 22};

        int total = calcularTotal(stock);
        double promedio = calcularPromedio(stock);
        int indiceMinimo = encontrarIndiceMenorStock(stock);

        System.out.println("Total de unidades en tienda: " + total);
        System.out.printf("Promedio de stock por producto: %.2f%n", promedio);
        System.out.println("Producto con menor stock: " + productos[indiceMinimo] + " (" + stock[indiceMinimo] + " unidades)");
    }

    // TODO 1: recorre el array y devuelve la suma total de unidades
    public static int calcularTotal(int[] stock) {
        int total = 0;
        // TODO: completa el for para sumar cada elemento de stock en total
        return total;
    }

    // TODO 2: usa calcularTotal() y devuelve el promedio (total / cantidad de productos)
    public static double calcularPromedio(int[] stock) {
        return 0.0; // reemplaza con la logica correcta
    }

    // TODO 3: recorre el array y devuelve el INDICE del producto con menor stock
    public static int encontrarIndiceMenorStock(int[] stock) {
        int indiceMenor = 0;
        // TODO: recorre desde el indice 1 y actualiza indiceMenor cuando encuentres un valor menor
        return indiceMenor;
    }
}
