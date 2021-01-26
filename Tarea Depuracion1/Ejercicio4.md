# tarea 2

### 1. En la función1… ¿Qué hacen estas líneas de código?

##### String string2 = "string2";
Genera un String llamado string2 que contiene "string2"
##### string2= string2.substring(0, string2.length()-1);
##### string2=string2+"1";
Elimina el ultimo 2 y añade un 1

### 2. ¿Qué valen las variables string1 y string2 antes de ejecutar el código de comprobación siguiente?

##### if(string1 == string2 ) {
##### System.out.println("SON IGUALES " + a);
##### }
##### else {
##### System.out.println("SON DIFERENTES");
##### }
"String1" y "String1"

### 3. ¿Por qué no funciona el operador == ? ¿Qué operador se debe usar en lugar de este?

Hay que utilizar la función propia de los Strings/Array : .equals()

### 4. La función2() está declarada como sigue:

##### public void funcion2() {
##### System.out.println("--------------------");
##### System.out.println("Esta es la función 2");
##### System.out.println("Cómo hago la llamada para que
##### funcione????");
##### }

### Esta función cómo la tengo que llamar desde el método MAIN para que funcione. Existen 2 posibilidades. Explícalas.

Ponerle el static y llamarlo desde el main
