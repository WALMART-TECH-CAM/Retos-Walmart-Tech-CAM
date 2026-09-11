# Nivel 12 — Validación de folios y códigos de barra

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

El sistema de recepción de mercancía en el CEDIS empezó a recibir códigos de barra mal escaneados. Antes de aceptarlos, Alex debe validar que el folio tenga el formato correcto y que el código de barras tenga el largo esperado y solo contenga dígitos.

## 🎯 Objetivo

Practicar manipulación de `String` (longitud, `charAt`, `substring`, recorridos) para validar formatos de datos de entrada.

## 📋 Reglas

- Un folio válido tiene el formato "WMT-" seguido de EXACTAMENTE 6 dígitos (ej. "WMT-004521").
- Un código de barras válido debe tener EXACTAMENTE 12 caracteres y todos deben ser dígitos (0-9).
- `validarFolio` y `validarCodigoBarras` deben devolver `true`/`false`, nunca lanzar excepciones por datos mal formados.
- No se permite usar expresiones regulares (`String.matches` con regex) en este nivel: la validación debe hacerse recorriendo caracteres manualmente.

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
Reto opcional: agrega validacion adicional: el codigo de barras no puede empezar con '0'.

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; NO representa código ni datos reales de Walmart.
