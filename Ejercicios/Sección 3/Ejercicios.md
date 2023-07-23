
# Sección 3 - Colecciones

## Ejercicios resueltos en vídeo

1. Vamos a implementar una clase que nos proporcione una lista ordenada ascendentemente. Seguiremos las siguientes especificaciones:
- Como base, extenderemos AbstractList
- Internamente, usaremos un ArrayList
- Usamos `Collections.sort` para ordenar elementos iniciales.
- Usamos `Collections.binarySearch` para obtener la posición de inserción.
- Los elementos deben implementar `Comparable`
- Los métodos que debemos implementar o sobrescribir son:
  -  `size()`
  -  `isEmpty()`
  -  `add(e)`
  -  `remove(index)`
  -  `clear`
  -  `addAll(collection)`
  -  `get`

Hay que tener en cuenta que `Collections.binarySearch` funciona de la siguiente forma:

- Si encuentra un elemento, devuelve la posición.
- Si no, devuelve `(-(PdI) - 1)`, donde `PdI` es la posición donde se debería insertar el elemento.

Por tanto, el nuevo valor se debe insertar en:

```java
int pos = Collections.binarySearch(list, elem);
int index = -(pos + 1).
```

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../Ejemplos/03.8_Ejercicio01/)

2. Se necesita implementar la estructura de datos necesaria para manejar un carrito de la compra. Estará basada en el uso de un `Map<Producto, Integer>``, donde podremos manejar las unidades solicitadas de cada producto. Por simplicidad, de cada `Producto` manejaremos solamente el nombre y el precio de venta.

Los métodos que tendrá nuestra clase serán:

- `add`: incrementará las unidades en 1 si ya existe.
- `remove`: eliminar un producto del carrito
- `clear`: borrar todos los productos del carrito
- `total`: obtener el precio total de toda la compra
- `get`: obtener una vista no modificable del carrito para poder iterarla y mostrarla.

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../Ejemplos/03.9_Ejercicio02/)


## Otros ejercicios resueltos

3. Vamos a modificar el carrito anterior para incluir las siguientes operaciones:

- `subtotal(producto)`: si el producto está en el carrito, devolverá el precio multiplicado por el número de unidades almacenadas.
- `set(producto, unidades)`: si el producto está en el carrito, establecerá el número de unidades del mismo; si no lo está, lo añade y establece dicho número de unidades. Si el nº de unidades es 0 y está en el carrito, se elimina.
- `decrement(producto)`: decrementa en 1 el número de unidades del producto en el carrito. Si el nº de unidades resultantes es 0, se eliminará el producto del carrito.

Puedes encontrar el código fuente completo de este ejercicio resuelto [aquí](./S3E3/)

4. Escribe un programa que tome como entrada una lista de números enteros y encuentre los pares de números cuya suma sea igual a un valor objetivo dado. El programa debe imprimir todos los pares de números encontrados.

Puedes encontrar el código fuente completo de este ejercicio resuelto [aquí](./S3E4/)


## Ejercicios propuestos

5. Dadas dos colecciones que pueden tener elementos repetidos, obtén el conjunto de elementos que están en la primera colección pero que no están en la segunda.

6. Dadas dos colecciones que pueden tener elementos repetidos, obtén la intersección de ambos, es decir, aquellos elementos que están en ambas colecciones.

7. Supongamos que tenemos una clase similar a la siguiente:

```java

public class Alumno {

    private String nombre, nacionalidad;
    private LocalDate fechaNacimiento;

    // Resto de métodos: constructores, getters, setters, equals, hashCode, toString, ...


}


```

Escribe un método que sea capaz de devolver un `Map` que nos permita agrupar a todos los alumnos por nacionalidad. ¿Qué tipos de datos deberíamos usar en ese map?

8. Basándonos en el ejercicio anterior, realiza otro método que nos devuelva a los alumnos agrupados por la edad que tienen a 31 de Diciembre del año actual.

9. Como parte de una implementación del juego del Solitario con la baraja española, se nos pide:

- Implementar la clase `Carta`
  - Almacenará el palo (oros, bastos, copas o espadas) y el número (1 al 12)
  - Implementará  `Comparable`, con el siguiente algoritmo (ficticio)
    - oro > copa > basto > espada
    - A igual palo, orden numérico de la carta (1 al 12).

- Implementa un método que permita generar todas las cartas de la baraja española.
- Implementa un método que sea capaz de barajar las cartas para obtenerlas desordenadas, como punto de partida del solitario.

10. Utilizando la implementación de la clase `Carta` del ejercicio anterior, vamos a implementar una clase `SetQueue` (genérica), que implementará una cola (los elementos se toman del inicio y se insertan por el final), pero en la que no puede haber elementos repetidos. Las operaciones asociadas a una cola son:

- Añadir (al final): el método se suele llamar o bien `add` u `offer`
- Tomar (desde la cabeza): el método se suele llamar o bien `remove` o `poll`
- Consultar la cabeza: el método se suele llamar o bien `element` o `peek`.

Implementa un ejemplo de uso de `SetQueue<Carta>` para almacenar la baraja española desordenada (te puedes basar en el ejercicio anterior).

BONUS: Si te animas, usando parte del código fuente de los ejercicios 9 y 10 puedes implementar el juego del reloj, cuyas reglas son las siguientes:

- Se barajan las cartas y se reparten todas las cartas entre todos los jugadores.
- Los jugadores no ven las cartas. Cada uno tiene su montón en la mano y va poniendo las cartas sobre el montón boca arriba por turnos.
- Al poner cada carta en la mesa, los jugadores van diciendo en voz alta un número: 1, 2, 3, 4, 5, 6, 7, Sota (10), Caballo (11) y Rey (12), y así sucesivamente se vuelve a comenzar por el 1.
- Si se dejan las cartas 8 y 9 en la baraja la secuencia sería: 1, 2, 3, 4, 5, 6, 7 , 8, 9, Sota, Caballo y Rey.
- Cuando la carta que acaba de poner el jugador coincide con la carta que le ha tocado nombrar, debería recoger todas las cartas del montón que pasarán a formar parte de su propio montón de cartas de las cuales se debe deshacer.
- Si el jugador siguiente no se da cuenta de esto y pone otra carta encima, ahora es él el candidato a llevarse el montón, a no ser que el jugador siguiente no se dé cuenta de esto. Y así sucesivamente, hasta que alguien se dé cuenta de la infracción que se cometió anteriormente.
- El objetivo del juego es liberarse de todas las cartas. Cuando un jugador se queda sin cartas, sale de la partida. El jugador que se quede finalmente solo, será el perdedor de la partida.

Puedes leer con mayor detenimiento las reglas y ver un vídeo explicativo [aquí](https://comosejuega.net/como-se-juega-el-reloj/#:~:text=Los%20jugadores%20no%20ven%20las,a%20comenzar%20por%20el%201.)

