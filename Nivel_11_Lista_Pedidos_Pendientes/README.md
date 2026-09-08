# Nivel 11 — Lista de pedidos pendientes

**Proyecto:** Desafío Walmart Tech Centroamérica
**Dificultad:** ⭐⭐⭐☆☆ Intermedio

---

## 🛒 La historia: Desafío Walmart Tech CAM

Alex acaba de ser contratado como desarrollador junior en **Walmart Global Tech Centroamérica**.
Su primer proyecto es un programa de entrenamiento de 25 niveles que lo llevará a
recorrer, en código, toda la cadena de valor de la compañía: primero el piso de venta
de una tienda, luego el **CEDIS** (Centro de Distribución) de su región, después la
logística entre sucursales, y finalmente los sistemas corporativos que analizan datos
a nivel nacional.

Cada nivel es un reto independiente (su propio `Main.java` y `README.md`), pero todos
comparten el mismo hilo narrativo y el mismo objetivo: ayudar a Alex a resolver un
problema real de Walmart Global Tech Centroamérica usando Java.


## 📍 Contexto de este nivel

El CEDIS recibe decenas de pedidos de sucursales cada día. Alex debe construir el módulo que administra esos pedidos: agregar nuevos, marcarlos como completados (eliminarlos de la lista de pendientes) y encontrar uno por su ID.

## 🎯 Objetivo

Practicar `ArrayList<Pedido>`: agregar, recorrer, buscar por atributo y eliminar elementos de una colección dinámica de objetos.

## 📋 Reglas

- Usa `ArrayList<Pedido>` (no arrays fijos) para poder agregar/quitar pedidos libremente.
- `buscarPedidoPorId(id)` debe devolver el objeto `Pedido` cuyo id coincide, o `null` si no existe.
- `completarPedido(id)` debe ELIMINAR de la lista el pedido cuyo id coincide (si existe) e imprimir confirmación; si no existe, debe imprimir que no se encontró.
- No debe haber dos pedidos con el mismo ID en la lista al mismo tiempo (puedes asumir que los datos de entrada ya son válidos).

## ▶️ Cómo ejecutar

1. Asegúrate de tener el JDK instalado (`java -version`).
2. Dentro de esta carpeta, compila:
   ```
   javac Main.java
   ```
3. Ejecuta:
   ```
   java Main
   ```
4. Busca los comentarios `// TODO` dentro de `Main.java` y completa la lógica faltante.

## Notas / Retos opcionales
Reto opcional: agrega un metodo que devuelva solo los pedidos cuya prioridad sea "Alta", en una nueva lista.

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; NO representa código ni datos reales de Walmart.
