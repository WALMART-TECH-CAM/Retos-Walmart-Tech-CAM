# Nivel 14 — Reporte de ventas por sucursal

**Proyecto:** Desafío Walmart Tech
**Dificultad:** ⭐⭐⭐⭐☆ Intermedio-Avanzado

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

El sistema de punto de venta genera miles de transacciones individuales al día. El área de finanzas regional necesita un reporte agregado: el total vendido POR sucursal, sin importar cuántas transacciones haya tenido cada una.

## 🎯 Objetivo

Practicar agregación de datos con `HashMap<String, Double>`, acumulando valores a partir de una lista de transacciones individuales.

## 📋 Reglas

- Cada `Transaccion` pertenece a una sucursal y tiene un monto.
- El reporte final debe ser un `HashMap<String, Double>` con el TOTAL vendido por cada sucursal.
- Si una sucursal no tiene transacciones, no debe aparecer en el mapa (no agregues sucursales con total 0 manualmente).
- Debes procesar la lista completa de transacciones en un solo recorrido (no hagas un recorrido distinto por cada sucursal).

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
Reto opcional: identifica e imprime cual es la sucursal con MAYOR total de ventas del reporte generado.

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; no representa código ni datos reales de Walmart.
