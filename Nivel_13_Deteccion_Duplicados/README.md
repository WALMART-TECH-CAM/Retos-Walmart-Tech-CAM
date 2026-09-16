# Nivel 13 — Detección de productos duplicados

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

Un proveedor envió por error un archivo con SKUs repetidos al sistema del CEDIS. Antes de procesarlo, Alex debe detectar cuáles SKUs están duplicados y cuántas veces aparece cada uno, para reportarlo al proveedor.

## 🎯 Objetivo

Usar `HashSet` para detectar duplicados de forma eficiente y `HashMap` para contar ocurrencias, evitando comparar todos los elementos entre sí (fuerza bruta).

## 📋 Reglas

- No se permite usar dos `for` anidados para comparar cada SKU contra todos los demás (fuerza bruta); debes usar `HashSet` y/o `HashMap`.
- `encontrarDuplicados` debe devolver un `HashSet<Integer>` con los SKUs que aparecen MÁS DE UNA VEZ.
- `contarOcurrencias` debe devolver un `HashMap<Integer, Integer>` donde la llave es el SKU y el valor es cuántas veces aparece.
- El orden de impresión de los resultados no importa (los Sets/Maps no garantizan orden).

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
Reto opcional: imprime tambien el SKU que mas veces se repite (el de mayor conteo).

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; no representa código ni datos reales de Walmart.
