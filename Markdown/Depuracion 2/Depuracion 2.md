# Depuración 2

#### 1. Explicar QUÉ HACE EL MÉTODO MAIN.
Primero crea el máximo de los vectores y lo almacena en la variable "TAMANYO", acto seguido genera dos arrays unidimensionales de tamaño "TAMANYO".
Se rellenan los dos arrays con números random, ambos con los mismos números en las mismas posiciones. Muestra por pantalla el array sin ordenar a través de un método. Ahora, dentro de una funciónque calcula el tiempo de compilado, invoca un método de ordenación. Y lo vuelve a mostrar, ahora ordenado. y muestra el tiempo que ha tardado este método. Luego, desde mostrar el array desordenado, hasta que muestra el array ordenado sólo cambia el método invocado. Y como antes muestra el tiempo que ha tardado este método.
#### 2. Poner un punto de ruptura (breakpoint) en la línea 78 (primer bucle del método intercambio) y, basándoos en los valores que van tomando las variables, explicad cómo funciona el método de ordenación de arrays por intercambio. Podéis crear tablas para ver cómo cambian los valores de los arrays
Este método empieza con 2 bucles anidados y va comprobando entre las posiciones "i"(cada iteración) con el siguiente en el array y si el primero es mayor lo intercambia a través de una variable auxiliar, y al final después de todas las iteraciones y repeticiones sale el array ordenado.

#### 3. Poner un punto de ruptura (breakpoint) en la línea 94 y explicad cómo funciona el método de ordenación de arrays de conteo. Podéis crear tablas para ver cómo cambian los valores de los arrays

Primero crea un array, count, cuyo tamaño es de todos los posibles números.
Luego en un bucle añade una unidad en las posiciones que coinciden con un valor del array.
Finalmente en otro bucle hace el mismo proceso pero a la inversa:
En otro bucle anidado, coge las posiciones, por orden, de "count"  donde hay un "1" y lo mete como valor en las posiciones del array, por orden. Luego le quita el "1" a "count" para no tener un bucle infinito.