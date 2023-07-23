
# Sección 2 - Genéricos

## Ejercicios resueltos en vídeo

1. Implementa una clase genérica llamada "Par" que pueda almacenar dos objetos de cualquier tipo. La clase deberá tener los siguientes métodos:

- Constructor: Un constructor que tome dos parámetros y los asigne a los campos internos de la clase.
- Métodos de acceso: Métodos para obtener y establecer los valores de los dos objetos almacenados.
- Método `toString`: Un método que devuelva una representación en forma de cadena de los dos objetos almacenados.
- Método estático `of`: un método que permitirá construir un Par a partir de los dos objetos recibidos.

Implementa un método main con algunas líneas de prueba

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../Ejemplos/02.6_Ejercicio01/)

1. Implementa la clase Vector, que será una colección que estará basada en un array. La clase debe ser genérica.
- Tendrá dos constructores: uno sin argumentos (tamaño 10) y otro con la capacidad inicial del vector.
- Tendrá métodos para añadir, eliminar y consultar los elementos del array.
- También tendrá un método para consultar el tamaño del array.

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../Ejemplos/02.7_Ejercicio02)


## Otros ejercicios resueltos

3. Vamos a crear la clase `VectorOrdenado`, basado en `Vector`. Para ello:
- Los elementos del `Vector` deben implementar la interfaz `Comparable`.
- El orden que mantendrá el vector será el orden natural del tipo de dato escogido.
- En cada operación de inserción o actualización, se deberá reajustar el orden.

Para realizar la ordenación se puede utilizar el método `Arrays.sort`.

Puedes encontrar el código fuente completo de este ejercicio resuelto [aquí](./S2E3/)

4. Una pila es una estructura de datos de tipo LIFO (_last in, first out_, el último en entrar es el primero en salir) y se utiliza para todo tipo de aplicaciones. Implementa, usando genéricos, la clase `Pila` de forma que puedas basarte en la implementación de `Vector` del ejercicio 2. Esta clase tendrá un método para añadir elementos (`push`) para sacar el elemento de la cabeza de la pila (`pop`) y para consultarlo sin sacarlo (`peek`). También un método que nos diga si la pila está vacía.

Al igual que en el ejercicio anterior, hay que modificar la clase `Vector`:

Puedes encontrar el código fuente completo de este ejercicio resuelto [aquí](./S2E4/)


## Ejercicios propuestos

5. Modifica el ejercicio 2 para que implemente un método `of` que reciba un _varargs_ del tipo especificado del vector y construya un vector donde se incluyan ya los elementos indicados como argumentos del método:

```java
Vector<String> vector = Vector.of("En","un","lugar","de","La","Mancha");
```

6. Al igual que la clase `Pila` que hemos visto en el ejercicio 4, es muy común utilizar otra estructura de datos, llamada `Cola`. Esta estructura es una estructura FIFO (_first in, first out_, el primero en entrar es el primero en salir). Implementa la clase `Cola` .

7. Crea una clase llamada `UtilsArrays` con los siguientes métodos estáticos genéricos:

- `reversed`: recibirá como argumento un array del tipo genérico, y devolverá una copia de dicho array pero con el orden invertido.
- `init`: recibirá como argumento un número entero (cantidad de elementos), y un elemento del tipo genérico, y devolverá un nuevo array con la capacidad pasada como argumento, y en todas las posiciones como valor el elemento de tipo genérico.
- `print`: mostrará todos los elementos del array

8. Modifica la clase anterior para añadir los siguientes métodos:

- `findFirstGreaterThan`, que recibirá un array de elementos genéricos (deben implementar `Comparable`) y un valor de dicho tipo genérico. Devolverá el primer valor del array que es mayor (no mayor o igual) que el valor proporcionado.
- Sobrecarga el método anterior para que reciba también como argumento dos valores enteros, que serán las posiciones de inicio y de fin del array donde se realizará la búsqueda de dicho elemento. Refactoriza el método anterior para que su implementación esté basado en el uso del método de este segundo apartado.
