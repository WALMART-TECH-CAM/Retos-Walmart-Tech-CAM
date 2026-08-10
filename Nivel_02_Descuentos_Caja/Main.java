public class Main {
    public static void main(String[] args) {
        System.out.println("=== Calculadora de descuentos - Piso de venta ===");

        double precioOriginal = 850.0;
        String dia = "Martes";
        String categoria = "Frutas y Verduras";
        boolean tieneTarjeta = true;

        double precioFinal = calcularPrecioFinal(precioOriginal, dia, categoria, tieneTarjeta);

        System.out.printf("Precio original: $%.2f%n", precioOriginal);
        System.out.printf("Precio final con descuento: $%.2f%n", precioFinal);
    }

    // TODO 1: completa la logica de este metodo siguiendo las reglas del README:
    //   - 10% si dia == "Martes" Y categoria == "Frutas y Verduras"
    //   - +15% si tieneTarjeta es true
    //   - el descuento total nunca debe superar 25%
    //   - devuelve el precioOriginal ya con el descuento aplicado
    public static double calcularPrecioFinal(double precioOriginal, String dia, String categoria, boolean tieneTarjeta) {
        double descuentoTotal = 0.0;

        // TODO 2: calcula el descuento base (10%) segun dia y categoria

        // TODO 3: suma el descuento adicional (15%) si tieneTarjeta es true

        // TODO 4: asegurate de que descuentoTotal nunca supere 0.25 (25%)

        // TODO 5: retorna precioOriginal menos el descuento aplicado
        return precioOriginal; // <-- reemplaza esta linea cuando implementes la logica
    }
}
