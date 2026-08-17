# Nivel 04 — Turnos del personal de tienda

**Proyecto:** Desafío Walmart Tech Centroamérica
**Dificultad:** ⭐⭐☆☆☆ Básico-Intermedio

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

El área de Recursos Humanos de la tienda necesita automatizar la asignación de turnos: cada empleado debe rotar entre "Mañana", "Tarde" y "Noche" en orden, según su posición en la lista.

## 🎯 Objetivo

Practicar bucles (`for`, `while`), el operador módulo (`%`) para rotar valores, y el uso de arrays paralelos.

## 📋 Reglas

- Los turnos disponibles son, en este orden: "Mañana", "Tarde", "Noche".
- El primer empleado de la lista recibe "Mañana", el segundo "Tarde", el tercero "Noche", el cuarto vuelve a "Mañana", y así sucesivamente.
- Debes usar el operador módulo (`%`) para calcular el turno correspondiente, no repitas condicionales manuales para cada caso.
- El resultado debe imprimirse en el mismo orden en que llegan los empleados.

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
Reto opcional: cuenta e imprime cuántos empleados quedaron en cada turno usando un array contador de tamaño 3.

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; NO representa código ni datos reales de Walmart.
