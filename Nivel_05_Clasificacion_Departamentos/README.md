# Nivel 05 — Clasificación de productos por departamento

**Proyecto:** Desafío Walmart Tech
**Dificultad:** ⭐⭐☆☆☆ Básico-Intermedio

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

Cada producto que entra a la tienda trae un código de departamento (un número). El sistema de recepción de mercancía necesita traducir ese código al nombre real del departamento para que el personal sepa en qué pasillo acomodarlo.

## 🎯 Objetivo

Practicar la estructura `switch` (o `switch` con expresión) para mapear códigos numéricos a categorías de negocio.

## 📋 Reglas

- Código 1 -> "Frutas y Verduras"
- Código 2 -> "Lácteos y Refrigerados"
- Código 3 -> "Abarrotes"
- Código 4 -> "Limpieza del Hogar"
- Código 5 -> "Electrónica"
- Cualquier otro código -> "Departamento Desconocido"
- Debes usar `switch`, no una cadena de `if/else if`.

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
Reto opcional: agrega el código 6 -> "Ropa y Textiles" y el código 7 -> "Farmacia" sin romper el caso por defecto.

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; no representa código ni datos reales de Walmart.
