📘 Taller: Polimorfismo en Java — Unidad 2 (POO)

Este repositorio contiene el desarrollo completo del Taller sobre Polimorfismo para la asignatura Programación Orientada a Objetos – Unidad 2, orientado por el docente John Carlos Arrieta Arrieta.

El taller explica el concepto de polimorfismo en Java, su utilidad dentro del diseño orientado a objetos, ejemplos correctos e incorrectos, y ejercicios prácticos implementados en código.

🎯 Objetivo del Taller

Comprender y aplicar el polimorfismo en Java, identificando cómo las clases derivadas pueden especializar el comportamiento heredado y cómo una referencia de la clase base puede invocar métodos sobrescritos en tiempo de ejecución.

📂 Contenido del Repositorio
✔ 1. Ejercicios Propuestos

Los ejercicios están implementados en carpetas separadas y cada uno demuestra un aspecto del polimorfismo:

🔸 Ejercicio 1 — Figura, Círculo y Rectángulo

Clase base: Figura

Clases derivadas: Circulo y Rectangulo

Cada clase implementa su propio método calcularArea()

Demuestra polimorfismo dinámico al calcular áreas según el tipo de figura.

🔸 Ejercicio 2 — Persona, Estudiante y Profesor

Clase base: Persona

Clases derivadas: Estudiante y Profesor

Cada clase sobrescribe el método presentarse()

Se usa una referencia de tipo Persona para invocar comportamientos distintos.

🔸 Ejercicio 3 — Uso Incorrecto del Polimorfismo

Incluye dos casos:

Error de compilación por invocar métodos no definidos en la clase base.

Mala práctica: sobrescribir métodos sin cambiar el comportamiento real.

Este ejercicio ayuda a identificar cuándo no usar polimorfismo.

🔸 Ejercicio 4 — Vehículo, Coche y Bicicleta

Clase base: Vehiculo

Clases derivadas: Coche y Bicicleta

Método sobrescrito mover()

Permite ver cómo el comportamiento ejecutado depende del objeto asignado en tiempo de ejecución.

🧪 Ejecución

Cada ejercicio incluye su respectivo Main para probar los comportamientos polimórficos.

Para ejecutar un ejercicio:

javac *.java
java Main


(O según la ruta de las carpetas si está organizado por paquetes.)

🧠 Lo Aprendido

El polimorfismo permite usar un mismo método con comportamientos diferentes.

Las clases derivadas pueden especializar los métodos heredados.

Es posible usar una referencia de clase padre para manejar distintos tipos de objetos.

También se abordaron errores y malas prácticas comunes en su uso.
