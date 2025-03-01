# Parcial 1er tercio
# Andrea Camila Torres González

* Creación del proyecto en springboot
Primero vamos a spring initializr y creamos el proyecto en springboot indicandole las dependencias necesarias,
una vez descargado lo abrimos y agragamos las clases correspondientes

![img.png](parcial%2Fsrc%2Fimg%2Fimg.png)

Compilamos el proyecto usando mvn package


*Creamos la clase product

![img_1.png](parcial%2Fsrc%2Fimg%2Fimg_1.png)

*Añadimos el controller dentro del package 'Controller'

![img_2.png](parcial%2Fsrc%2Fimg%2Fimg_2.png)

*Creamos una interfaz de servicio y una clase que implemente esta interfáz 'ProductService' para que sea extendible y adaptable
![img_5.png](parcial%2Fsrc%2Fimg%2Fimg_5.png)
![img_4.png](parcial%2Fsrc%2Fimg%2Fimg_4.png)

*Agregamos la clase de excepciones para controlar los diferentes caminos, cuando se envian parametros vacios, la colección está vacia o nula
![img_3.png](parcial%2Fsrc%2Fimg%2Fimg_3.png)

*En la clase Controler hacemos uso de Response Entity para responder con codigos HTTP y el objeto o mensaje segun corresponda
![img_6.png](img_6.png)

*Hacemos las pruebas en Postman para probar el funcionamiento del programa
<ol>
<li>Metodo Post</li>

![img_2.png](img_2.png)

<li> Metodo para obtener todos los productos </li>

![img_3.png](img_3.png)

<li> Metod para obtener un producto en específico por ID</li>

![img_4.png](img_4.png)

</ol>



