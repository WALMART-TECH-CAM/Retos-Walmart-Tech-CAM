# Nivel 06 — Ranking de sucursales por ventas

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

Alex es trasladado temporalmente al equipo regional. Cada fin de mes, la gerencia regional pide un ranking de todas las sucursales de la zona ordenadas de mayor a menor venta, para reconocer a las mejores y dar seguimiento a las que necesitan apoyo.

## 🎯 Objetivo

Implementar un algoritmo de ordenamiento (Bubble Sort, Selection Sort o el que prefieras) para ordenar un array de objetos `Sucursal` de mayor a menor venta, resolviendo empates por nombre alfabético.

## 📋 Reglas

- El ordenamiento principal es por ventas: de MAYOR a MENOR.
- Si dos sucursales tienen exactamente las mismas ventas, deben quedar ordenadas alfabéticamente por nombre (A-Z).
- Puedes usar cualquier algoritmo de ordenamiento manual (no se permite `Arrays.sort` con Comparator en este nivel; el objetivo es que implementes la lógica de comparación e intercambio a mano).
- El array original debe quedar modificado (ordenamiento in-place).

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
Reto opcional: agrega un metodo `topN(Sucursal[] sucursales, int n)` que imprima solo las primeras N sucursales del ranking.

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; no representa código ni datos reales de Walmart.
