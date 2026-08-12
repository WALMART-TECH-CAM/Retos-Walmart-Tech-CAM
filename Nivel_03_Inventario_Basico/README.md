# Nivel 03 — Control de inventario básico

**Proyecto:** Desafío Walmart Tech CAM
**Dificultad:** ⭐☆☆☆☆ Básico

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
problema real de Walmart Global Tech usando Java.


## 📍 Contexto de este nivel

El gerente de la tienda necesita un reporte rápido cada mañana: cuántas unidades hay en total, cuál es el promedio de stock por producto, y qué producto está en riesgo de agotarse (el de menor cantidad).

## 🎯 Objetivo

Practicar arrays, recorridos con `for`, y el cálculo de suma, promedio y mínimo sobre una colección de datos.

## 📋 Reglas

- Los arrays `productos` y `stock` están relacionados por posición (índice).
- El total de unidades debe ser la suma exacta de todo el array `stock`.
- El promedio debe calcularse como total / cantidad de productos (usa double).
- Debes encontrar el producto con MENOR stock y mostrar su nombre y cantidad.
- Si hay empate en el mínimo, reporta el primero que encuentres recorriendo el array.

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
Reto opcional: agrega una alerta que imprima "⚠️ REABASTECER" para todo producto con stock menor a 15 unidades.

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; NO representa código ni datos reales de Walmart.
