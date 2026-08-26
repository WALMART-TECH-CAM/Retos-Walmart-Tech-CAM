# Nivel 07 — Búsqueda de productos en el CEDIS

**Proyecto:** Desafío Walmart Tech
**Dificultad:** ⭐⭐⭐☆☆ Intermedio

---

## 🛒 La historia: Desafío Walmart Tech

Alex acaba de ser contratado como desarrollador junior en **Walmart Global Tech**.
Su primer proyecto es un programa de entrenamiento de 25 niveles que lo llevará a
recorrer, en código, toda la cadena de valor de la compañía: primero el piso de venta
de una tienda, luego el **CEDIS** (Centro de Distribución) de su región, después la
logística entre sucursales, y finalmente los sistemas corporativos que analizan datos
a nivel nacional.

Cada nivel es un reto independiente (su propio `Main.java` y `README.md`), pero todos
comparten el mismo hilo narrativo y el mismo objetivo: ayudar a Alex a resolver un
problema real de Walmart Global Tech usando Java.


## 📍 Contexto de este nivel

Alex llega por primera vez al CEDIS (Centro de Distribución). El sistema de consulta de inventario es lentísimo cuando busca productos uno por uno. Su líder le pide implementar y comparar dos formas de búsqueda: lineal (la actual) y binaria (más eficiente, pero requiere que el array esté ordenado).

## 🎯 Objetivo

Implementar búsqueda lineal y búsqueda binaria sobre un array de SKUs (códigos de producto) ordenado, y comparar cuántas comparaciones hace cada una.

## 📋 Reglas

- El array `skus` YA viene ordenado de menor a mayor; no lo reordenes.
- `busquedaLineal` debe recorrer el array elemento por elemento hasta encontrar el SKU o llegar al final.
- `busquedaBinaria` debe implementarse de forma clásica (mitad, mitad, mitad...), sin usar métodos ya hechos como `Arrays.binarySearch`.
- Ambos métodos deben devolver el ÍNDICE del SKU si lo encuentran, o -1 si no existe.
- Debes contar cuántas comparaciones realiza cada algoritmo para el mismo SKU buscado.

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
Reto opcional: prueba buscar un SKU que NO existe y confirma que ambos métodos devuelven -1 correctamente.

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; no representa código ni datos reales de Walmart.
