# Depuracion 3

#### 1. Explicar QUÉ HACE EL MÉTODO MAIN. Podéis poner líneas de código (prints) para ver cómo quedan las variables del programa, por ejemplo el vector.

Primero crea variable num que servira mas adelante
luego crea las variables "siguiente posicion libre", "contador de cosas en la lista" y "posición del numero en la lista" y se inicia lista.

hay un bucle que finaliza cuando la lista esta llena

Luego dentro del bucle se inserta un numero a la lista, la valiable enc cambia a la posicion asignada en la lista del numero dado si la hay.
De esta lista de cosas si hay una posicion asignada ↑ menor que la proxima posicion libre hace cosas ↓.
En la posicion asignada se le suma 1 a b.
Si no crea una nueva cosa en la posicion libre proxima
Regenera la siguiente posicion libre que logicamente es la siguiente.
Comprueba que ha llegado al límite kMAX.
Cuando llega al límite sale y cierra el Scanner

#### 2. Poner un punto de ruptura (breakpoint) en la línea 26 (primer bucle del método main) y, basándoos en los valores que van tomando las variables, explicad qué hace y cómo funciona el método. Podéis crear tablas para ver cómo cambian los valores de las variables y del array.

lista que es un array de cosas (esencialmente 2 valores) el primer valor "a" determina un valor guardado en una posicion del array, el segundo "b" determina cuantas veces se ha introducido el mismo valor en el array. Esencialmente:

| posicion del array | cosa "a" | cosa "b" | 
| ------------------ | -------- | -------- |
|         0          |     5    |    6     | 
|         1          |     6    |    1     | 
|         2          |     7    |    5     | 
|         3          |     8    |    3     |
|         4          |    72    |   80     |
|         5          |    0     |    0     |
|         6          |    0     |    0     |
|         7          |    0     |    0     |
|         8          |    0     |    0     |
|         9          |    0     |    0     |

Para este ejemplo en la posicion 0 de la lista se guarda el 5 ("a") 6 veces ("b").

En el 1 guarda el 6 ("a") 1 veces ("b").

En el 2 guarda el 7 ("a") 5 veces ("b").

En el 3 guarda el 8 ("a") 3 veces ("b").

En el 4 guarda el 72 ("a") 80 veces ("b").

A partir de aquí no ha guardado todavia numeros en las posiciones de la 5 a la nueve.



#### 3. Basándoos en el funcionamiento, determinad qué indican o a qué hacen referencia las variables “a” y “b” de la clase “cosa”.

Hacen que cosa tenga sentido. La "a" es el valor a contabilizar y "b" es la contabilización de "a"