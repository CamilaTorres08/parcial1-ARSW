# Parcial 1er tercio
# Andrea Camila Torres González

* Creación del proyecto en springboot
Primero vamos a spring initializr y creamos el proyecto en springboot indicandole las dependencias necesarias,
una vez descargado lo abrimos y agragamos las clases correspondientes

![img.png](src%2Fimg%2Fimg.png)

Compilamos el proyecto usando mvn package

![img.png](img.png)

*Creamos la clase product

![img_1.png](img_1.png)

*Añadimos el controller dentro del package 'Controller'

![img_2.png](img_2.png)

*Creamos una interfaz de servicio y una clase que implemente esta interfáz 'ProductService' para que sea extendible y adaptable
![img_3.png](img_3.png)
![img_4.png](img_4.png)

*Agregamos la clase de excepciones para controlar los diferentes caminos, cuando se envian parametros vacios, la colección está vacia o nula
![img_5.png](img_5.png)

*En la clase Controler hacemos uso de Response Entity para responder con codigos HTTP y el objeto o mensaje segun corresponda
![img_6.png](img_6.png)

*Hacemos las pruebas en Postman para probar el funcionamiento del programa
<ol>
<li>Metodo Post</li>

![img_7.png](img_7.png)

<li> Metodo para obtener todos los productos </li>

![img_8.png](img_8.png)

<li> Metod para obtener un producto en específico por ID</li>

![img_9.png](img_9.png)

</ol>



