public class Main {
    public static void main(String[] args) {
        System.out.println("=== Validacion de folios y codigos de barra ===");

        String[] folios = {"WMT-004521", "WMT-12", "wmt-004521", "WMT-00452A"};
        String[] codigos = {"123456789012", "12345", "12345678901A"};

        for (String folio : folios) {
            System.out.println("Folio '" + folio + "' valido? " + validarFolio(folio));
        }

        for (String codigo : codigos) {
            System.out.println("Codigo '" + codigo + "' valido? " + validarCodigoBarras(codigo));
        }
    }

    // TODO 1: verifica que folio comience con "WMT-" y que despues tenga EXACTAMENTE 6 digitos
    // Pista: usa folio.startsWith("WMT-"), folio.length(), y recorre los caracteres restantes
    // verificando que cada uno sea un digito (Character.isDigit(c))
    public static boolean validarFolio(String folio) {
        return false; // reemplaza con la logica correcta
    }

    // TODO 2: verifica que codigo tenga exactamente 12 caracteres y que TODOS sean digitos
    public static boolean validarCodigoBarras(String codigo) {
        return false; // reemplaza con la logica correcta
    }
}
