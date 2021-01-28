# Depuración 2

#### 1. Explicar QUÉ HACE EL MÉTODO MAIN.
Primero crea el máximo de los vectores y lo almacena en la variable "TAMANYO", acto seguido genera dos arrays unidimensionales de tamaño "TAMANYO".
Se rellenan los dos arrays con números random, ambos con los mismos números en las mismas posiciones. Muestra por pantalla el array sin ordenar a través de un método. Ahora, dentro de una funciónque calcula el tiempo de compilado, invoca un método de ordenación. Y lo vuelve a mostrar, ahora ordenado. y muestra el tiempo que ha tardado este método. Luego, desde mostrar el array desordenado, hasta que muestra el array ordenado sólo cambia el método invocado. Y como antes muestra el tiempo que ha tardado este método.
#### 2. Poner un punto de ruptura (breakpoint) en la línea 78 (primer bucle del método intercambio) y, basándoos en los valores que van tomando las variables, explicad cómo funciona el método de ordenación de arrays por intercambio. Podéis crear tablas para ver cómo cambian los valores de los arrays
Este método empieza con 2 bucles anidados y va comprobando entre las posiciones "i"(cada iteración) con el siguiente en el array y si el primero es mayor lo intercambia a través de una variable auxiliar, y al final después de todas las iteraciones y repeticiones sale el array ordenado.

#### 3. Poner un punto de ruptura (breakpoint) en la línea 94 y explicad cómo funciona el método de ordenación de arrays de conteo. Podéis crear tablas para ver cómo cambian los valores de los arrays

Primero crea un array, count, cuyo tamaño es de todos los posibles números.(Para posibles 10 números)

|Nombre|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|------|---|---|---|---|---|---|---|---|---|---|
|array |5  |2  |7  |9  |4  |6  | ø | ø | ø | ø |
|count |0  |1  |0  |1  |1  |1  |1  |0  |1  |0  |

Luego en un bucle añade una unidad en las posiciones que coinciden con un valor del array.
Finalmente en otro bucle hace el mismo proceso pero a la inversa:
En otro bucle anidado, coge las posiciones, por orden, de "count"  donde hay un "1" y lo mete como valor en las posiciones del array, por orden. Luego le quita el "1" a "count" para no tener un bucle infinito.

|Iteración 0|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|-----------|---|---|---|---|---|---|---|---|---|---|
|array      |5  |2  |7  |9  |4  |6  | ø | ø | ø | ø |
|count      |0  |1  |0  |1  |1  |1  |1  |0  |1  |0  |

|Iteración 1|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|-----------|---|---|---|---|---|---|---|---|---|---|
|array      |2  |2  |7  |9  |4  |6  | ø | ø | ø | ø |
|count      |0  |0  |0  |1  |1  |1  |1  |0  |1  |0  |

|Iteración 2|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|-----------|---|---|---|---|---|---|---|---|---|---|
|array      |2  |2  |7  |9  |4  |6  | ø | ø | ø | ø |
|count      |0  |0  |0  |1  |1  |1  |1  |0  |1  |0  |

|Iteración 3|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|-----------|---|---|---|---|---|---|---|---|---|---|
|array      |2  |4  |7  |9  |4  |6  | ø | ø | ø | ø |
|count      |0  |0  |0  |0  |1  |1  |1  |0  |1  |0  |

|Iteración 4|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|-----------|---|---|---|---|---|---|---|---|---|---|
|array      |2  |4  |5  |9  |4  |6  | ø | ø | ø | ø |
|count      |0  |0  |0  |0  |0  |1  |1  |0  |1  |0  |

|Iteración 5|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|-----------|---|---|---|---|---|---|---|---|---|---|
|array      |2  |4  |5  |6  |4  |6  | ø | ø | ø | ø |
|count      |0  |0  |0  |0  |0  |0  |1  |0  |1  |0  |

|Iteración 6|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|-----------|---|---|---|---|---|---|---|---|---|---|
|array      |2  |4  |5  |6  |7  |6  | ø | ø | ø | ø |
|count      |0  |0  |0  |0  |0  |0  |0  |0  |1  |0  |

|Iteración 7|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|-----------|---|---|---|---|---|---|---|---|---|---|
|array      |2  |4  |5  |6  |7  |6  | ø | ø | ø | ø |
|count      |0  |0  |0  |0  |0  |0  |0  |0  |1  |0  |

|Iteración 8|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|-----------|---|---|---|---|---|---|---|---|---|---|
|array      |2  |4  |5  |6  |7  |9  | ø | ø | ø | ø |
|count      |0  |0  |0  |0  |0  |0  |0  |0  |0  |0  |

|Iteración 9|[0]|[1]|[2]|[3]|[4]|[5]|[6]|[7]|[8]|[9]|
|-----------|---|---|---|---|---|---|---|---|---|---|
|array      |2  |4  |5  |6  |7  |9  | ø | ø | ø | ø |
|count      |0  |0  |0  |0  |0  |0  |0  |0  |0  |0  |

y aquí ya tenemos el array ordenado
