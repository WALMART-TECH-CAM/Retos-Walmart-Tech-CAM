# Nivel 08 — Gestión de empleados con POO

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

El área de RH regional migra su hoja de cálculo de empleados a un sistema en Java. Necesitan una clase `Empleado` bien encapsulada, capaz de calcular antigüedad y aplicar aumentos de salario respetando las políticas de la empresa.

## 🎯 Objetivo

Practicar encapsulamiento (atributos privados + getters/setters), constructores, y métodos con reglas de negocio dentro de una clase.

## 📋 Reglas

- Los atributos de `Empleado` deben ser privados; el acceso externo solo por getters/setters.
- `calcularAntiguedad(anioActual)` devuelve la diferencia entre anioActual y anioIngreso.
- `aumentarSalario(porcentaje)` incrementa el salario del empleado, pero NUNCA puede aplicarse un aumento mayor al 20% de una sola vez (si se pide más, se limita a 20%).
- `aumentarSalario` no debe aceptar porcentajes negativos (si se recibe uno negativo, no debe cambiar el salario).

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
Reto opcional: agrega un metodo `esElegibleParaBono()` que devuelva true si la antiguedad es mayor o igual a 5 años.

---
**Elaborado para la comunidad tech.** Este reto es un ejercicio educativo inspirado en
problemas reales de retail/logística; no representa código ni datos reales de Walmart.
