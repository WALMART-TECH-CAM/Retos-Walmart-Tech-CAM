# Nivel 10 — Pila de cajas en el almacén

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

En el almacén de la tienda, las cajas de mercancía se apilan una sobre otra por límite de espacio: la última caja que se coloca es la primera que se retira (LIFO). Alex debe programar el control de esa pila, incluyendo un límite máximo de altura por seguridad.

## 🎯 Objetivo

Usar `java.util.Stack` (o una implementación propia con array) para simular la pila de cajas, validando reglas de capacidad máxima.

## 📋 Reglas

- La pila tiene una capacidad máxima de 5 cajas (`CAPACIDAD_MAXIMA = 5`).
- Si se intenta apilar una caja cuando la pila está llena, debe rechazarse e imprimir un mensaje de advertencia (no debe lanzar una excepción sin controlar).
- Si se intenta retirar una caja de una pila vacía, debe rechazarse e imprimir un mensaje de advertencia.
- `apilar(nombreCaja)` agrega arriba de la pila; `retirar()` quita y devuelve la caja de hasta arriba.

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
Reto opcional: agrega un metodo `verTope()` que muestre cual es la caja hasta arriba sin retirarla (peek).

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; no representa código ni datos reales de Walmart.
