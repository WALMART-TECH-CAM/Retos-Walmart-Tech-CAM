# Nivel 09 — Cola de atención en caja

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

Es temporada alta y las filas en caja son enormes. La tienda quiere digitalizar el sistema de turnos: los clientes normales hacen fila FIFO, pero los clientes de la fila preferencial (adultos mayores, embarazadas, personas con discapacidad) deben pasar antes que los clientes normales que llegaron después que ellos.

## 🎯 Objetivo

Usar `java.util.Queue` (o una implementación propia) para simular una fila de atención con una regla simple de prioridad.

## 📋 Reglas

- Los clientes normales se atienden en el orden en que llegan (FIFO).
- Un cliente preferencial debe atenderse antes que cualquier cliente normal que siga en la fila en ese momento (pero después de los preferenciales que ya llegaron antes que él).
- Debes usar dos colas: una para clientes normales y otra para preferenciales.
- El método `atenderSiguiente()` primero vacía la cola preferencial; si está vacía, atiende la cola normal.

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
Reto opcional: imprime cuántos clientes en total fueron atendidos y cuántos de cada tipo.

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; NO representa código ni datos reales de Walmart.
