# 🛒 Desafío Walmart Tech

Un mini-juego / entrenamiento de programación en Java: **25 niveles independientes**,
cada uno en su propia carpeta con su `Main.java` (con TODOs por resolver) y su
`README.md` (contexto, objetivo, reglas y dificultad).

Pensado para subirse tal cual a GitHub como repositorio de retos de código.

## La historia

Alex es contratado como desarrollador junior en **Walmart Global Tech** y atraviesa un
programa de entrenamiento de 25 niveles que recorre, en código, la cadena de valor real
de una empresa de retail: piso de tienda → CEDIS (Centro de Distribución) → logística
regional → sistemas corporativos de análisis de datos a nivel nacional.

Todos los niveles están conectados por esta historia, pero **cada carpeta es un
proyecto Java 100% independiente**: se puede compilar y ejecutar por separado.

## Estructura del repositorio

```
Desafio_Walmart_Tech/
├── README.md                                  (este archivo)
├── Nivel_01_Bienvenida_WalmartTech/
│   ├── Main.java
│   └── README.md
├── Nivel_02_Descuentos_Caja/
│   ├── Main.java
│   └── README.md
├── ...
└── Nivel_25_Simulador_Cadena_Suministro/
    ├── Main.java
    └── README.md
```

## Mapa de niveles

| # | Nivel | Tema técnico | Dificultad |
|---|-------|---------------|------------|
| 01 | Bienvenida a Walmart Global Tech | Variables, tipos primitivos, `printf` | ⭐☆☆☆☆ |
| 02 | Calculadora de descuentos en caja | Condicionales, operadores lógicos | ⭐☆☆☆☆ |
| 03 | Control de inventario básico | Arrays, suma/promedio/mínimo | ⭐☆☆☆☆ |
| 04 | Turnos del personal de tienda | Loops, operador módulo | ⭐⭐☆☆☆ |
| 05 | Clasificación de productos por departamento | `switch` | ⭐⭐☆☆☆ |
| 06 | Ranking de sucursales por ventas | Ordenamiento (sorting) | ⭐⭐⭐☆☆ |
| 07 | Búsqueda de productos en el CEDIS | Búsqueda lineal y binaria | ⭐⭐⭐☆☆ |
| 08 | Gestión de empleados con POO | Clases, encapsulamiento | ⭐⭐⭐☆☆ |
| 09 | Cola de atención en caja | `Queue`, prioridad | ⭐⭐⭐☆☆ |
| 10 | Pila de cajas en el almacén | `Stack`, capacidad máxima | ⭐⭐⭐☆☆ |
| 11 | Lista de pedidos pendientes | `ArrayList` de objetos | ⭐⭐⭐☆☆ |
| 12 | Validación de folios y códigos de barra | Manipulación de `String` | ⭐⭐⭐☆☆ |
| 13 | Detección de productos duplicados | `HashSet` / `HashMap` | ⭐⭐⭐⭐☆ |
| 14 | Reporte de ventas por sucursal | Agregación con `HashMap` | ⭐⭐⭐⭐☆ |
| 15 | Niveles de reabastecimiento en cascada | Recursividad | ⭐⭐⭐⭐☆ |
| 16 | Rutas de reparto entre tiendas | Grafos (listas de adyacencia) | ⭐⭐⭐⭐☆ |
| 17 | Optimización de rutas del CEDIS | BFS | ⭐⭐⭐⭐☆ |
| 18 | Ruta más corta CEDIS-tienda | Dijkstra | ⭐⭐⭐⭐⭐ |
| 19 | Organización jerárquica de sucursales | Árbol Binario de Búsqueda | ⭐⭐⭐⭐⭐ |
| 20 | Balanceo de carga en camiones | Knapsack 0/1 (Programación Dinámica) | ⭐⭐⭐⭐⭐ |
| 21 | Predicción de demanda con matrices | Arrays 2D, media móvil | ⭐⭐⭐⭐⭐ |
| 22 | Sistema de turnos con concurrencia | `Thread`, `synchronized` | ⭐⭐⭐⭐⭐ |
| 23 | Motor de recomendaciones de productos | Similitud de Jaccard | ⭐⭐⭐⭐⭐ |
| 24 | Detección de fraude en transacciones | Heurísticas / scoring de riesgo | ⭐⭐⭐⭐⭐ |
| 25 | Simulador integral de la cadena de suministro | Proyecto integrador (Grafos + Dijkstra + Knapsack + POO) | 🏆 |

## Cómo jugar / usar este repo

1. Clona o descarga el repositorio.
2. Entra a la carpeta del nivel que quieras resolver (por ejemplo `Nivel_06_Ranking_Sucursales`).
3. Lee su `README.md` para entender el contexto, objetivo y reglas.
4. Abre `Main.java` y resuelve los comentarios `// TODO`.
5. Compila y corre:
   ```
   javac Main.java
   java Main
   ```
6. ¡Avanza al siguiente nivel!

## Contribuir / comunidad

Este proyecto está pensado para compartirse y mejorarse con la comunidad: agrega tus
soluciones en un fork, propón retos opcionales extra, o comparte tu progreso. Es un
ejercicio educativo inspirado en problemas reales de retail/logística; no representa
código, datos ni sistemas reales de Walmart.
