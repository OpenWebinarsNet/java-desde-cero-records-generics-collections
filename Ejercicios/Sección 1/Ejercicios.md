
# Sección 1 - Records y Enums

## Ejercicios resueltos en vídeo


1. Escribe un programa en Java que modele una lista de tareas. Una tarea no se puede modificar una vez que se ha creado y agregado a la lista de tareas. Los campos que contendrá serán el nombre, la descripción y la fecha de vencimiento. Crea un método main que permita agregar tareas y listarlas.

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../Ejemplos/01.6_Ejercicio01/)

2. Escribe un programa en Java para modelar una tienda de libros. Cada libro tiene un título, un autor, un género y un precio. Utiliza un registro (record) llamado Libro para representar cada libro, con los campos correspondientes. Además, define una enumeración (enum) llamada Genero que contenga los posibles géneros de los libros, como "Ficción", "No Ficción" y "Ciencia". Luego, crea un conjunto de libros y realiza las siguientes operaciones:

Agrega tres libros al conjunto.
Muestra todos los libros del conjunto.
Encuentra los libros de un género específico y muéstralos.

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../Ejemplos/01.7_Ejercicio02/)

## Otros ejercicios resueltos

3. Escribe un programa en Java que nos permita gestionar unas ofertas sobre productos. Para ello tendremos la clase Producto, y el record OfertaProducto. Una instancia de Producto se puede modificar, pero una instancia de OfertaProducto, una vez que se ha creado, ya no se puede modificar. De cada Producto queremos saber el código, un valor entero, el nombre, la descripción y el precio. Si de algún producto hay una OfertaProducto, en ella queremos conocer el código, el nombre, el precio en oferta, y las fechas de inicio y de fin de dicha oferta. Añade un método estático of al record OfertaProducto que permita crear una OfertaProducto a partir de una instancia de la clase Producto.

Puedes encontrar el código fuente completo de este ejercicio resuelto [aquí](./S01E03/)

4. Mejora el ejercicio anterior añadiendo lo siguiente:

- Tendremos una nueva clase, `Categoria` que permitirá organizar la categoría de los productos. De cada categoría queremos conocer el identificador, un número, el nombre y una descripción.
- Cada instancia de `Producto` tendrá asociada una categoría.
- Modifica el record OfertaProducto para incluir como atributo el nombre de la categoría.

Puedes encontrar el código fuente completo de este ejercicio resuelto [aquí](./S01E04/)

## Ejercicios propuestos

5. Añade un método al ejercicio anterior que permita:

- Manejar un array de ofertas
- Incluir un método que permita obtener todas las ofertas de una determinada categoría.

6. Queremos implementar una aplicación que gestione figuras en un plano, y para ello necesitamos manejar el concepto de `Punto`. Crea el mismo a través del uso de un `record`, incluyendo sus coordenadas x e y como valores `double`. Añade al record dos métodos, `moverX` y `moverY` que nos permitirá obtener un nuevo punto en el que se haya incrementado (o decrementado, porque el valor también puede ser negativo) dicha componente. Implementa, usando los anteriores, el método `move`, que reciba un desplazamiento para ambas coordenadas.

7. Implementa una enumeración que nos permita manejar los planetas del Sistema Solar (queda a tu elección determinar si Plutón es un planeta o no). Añade como atributos la cantidad de kms a los que se encuentran de La Tierra, así como el nº de lunas que tiene. Añade además un método que devuelva la distancia de la Tierra, pero en años luz. Implementa también una clase App con un método main que nos muestre por consola la información de todos los planetas.

8. Crea una aplicación para gestionar pedidos sobre Pizza. Para ello, necesitamos gestionar las siguientes clases:
- Pizza, con un identificador, ingredientes, tamaño y precio base.
- Pedido, con la pizza solicitada, el número de unidades y los datos del cliente. 
- El Pedido también incluirá el estado del pedido manejado a través de un Enum, con los siguientes posibles valores: RECIBIDO, EN_PREPARACION, EN_REPARTO, ENTREGADO.

Implementa una clase, GestionPizzeria, que permita inicializar unas cuantas pizzas a modo de carta, e incluya métodos para recrear un nuevo pedido, cambiar el estado de los pedidos así como mostrarlos.