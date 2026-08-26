public class Main {
    public static void main(String[] args) {
        System.out.println("=== Busqueda de productos en el CEDIS ===");

        int[] skus = {1001, 1005, 1012, 1020, 1033, 1045, 1050, 1067, 1080, 1099};
        int skuBuscado = 1045;

        int resultadoLineal = busquedaLineal(skus, skuBuscado);
        int resultadoBinaria = busquedaBinaria(skus, skuBuscado);

        System.out.println("SKU buscado: " + skuBuscado);
        System.out.println("Indice encontrado (lineal): " + resultadoLineal);
        System.out.println("Indice encontrado (binaria): " + resultadoBinaria);
    }

    // TODO 1: recorre el array de principio a fin comparando cada posicion con objetivo
    // devuelve el indice si lo encuentras, o -1 si no esta
    public static int busquedaLineal(int[] skus, int objetivo) {
        return -1; // reemplaza con la logica correcta
    }

    // TODO 2: implementa busqueda binaria clasica (inicio, fin, medio)
    // recuerda: el array YA esta ordenado ascendentemente
    public static int busquedaBinaria(int[] skus, int objetivo) {
        int inicio = 0;
        int fin = skus.length - 1;

        // TODO: mientras inicio <= fin, calcula medio, compara skus[medio] con objetivo
        // y ajusta inicio o fin segun corresponda

        return -1; // reemplaza con la logica correcta
    }
}
