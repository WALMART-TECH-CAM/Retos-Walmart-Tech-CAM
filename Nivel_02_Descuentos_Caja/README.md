# Nivel 02 — Calculadora de descuentos en caja

**Proyecto:** Desafío Walmart Tech
**Dificultad:** ⭐☆☆☆☆ Básico

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

Alex es asignado por una semana a piso de venta para entender cómo funcionan las cajas registradoras. Le piden ayudar a corregir el módulo que calcula el descuento final de una compra, ya que actualmente siempre cobra el precio completo.

## 🎯 Objetivo

Practicar estructuras condicionales (`if`, `else if`, `else`) y operadores lógicos (`&&`, `||`) para calcular un descuento según varias condiciones de negocio.

## 📋 Reglas

- Si el día es "Martes" y la categoría es "Frutas y Verduras", el descuento base es 10%.
- Si el cliente tiene tarjeta Walmart (`tieneTarjeta = true`), se suma 15% adicional de descuento.
- El descuento TOTAL nunca puede superar el 25%, sin importar cuántas condiciones se cumplan.
- Si no aplica ninguna condición, el descuento es 0%.
- El precio final nunca puede ser negativo ni menor a $0.0.

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
Reto opcional: agrega una tercera condición: si el monto de compra supera $1000, sumar 5% adicional (respetando siempre el tope de 25%).

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; no representa código ni datos reales de Walmart.
