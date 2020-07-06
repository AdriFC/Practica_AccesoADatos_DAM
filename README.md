# Pac_AccesoADatos
Repositorío para la práctica de Acceso a datos (Ciclo superior DAM)

En esta PAC se van a valorar vuestros conocimientos sobre Hibernate.
Realizaremos un ejercicio en el que tendréis que crear la configuración e ingresar los datos necesarios.

¡Es muy importante seguir todas las puntualizaciones que realizo sobre la PAC, deberéis de poner los mismos nombres de atributos y métodos!
Ejercicios:

1. Crear los ficheros de configuración para hibernate con los datos:

a. Connexión a 127.0.0.1, puerto 3306
b. Username: ilerna
c. Password: Ilerna_1234
d. Base de datos: m06

2. Crea las clases con los atributos expuestos a continuación, también deberás crear las funciones necesarias para que funcione con hibernate y el método toString() de cada clase.

a. Modulo:
• Long id
• String nombre
• String código

b. Alumno:
• Long id
• String nombre
• String nacionalidad
• int edad
• String sexo
• Set<Módulos>)
1. La relación entre Alumno y Modulo será llamada alumno_modulo

c. Profesor:
• Long id (se debe asignar automáticamente)
• String nombre
• String sexo

3. Crea los archivos de configuración hibernate para dichas clases (Alumno, Profesor y Modulo).
Todos los ID se deberán establecer de forma autonumérica.

a. Las tablas resultantes tendrán el nombre:
• alumnos
• modulos
• alumnos_modulo
• profesores

4. Creación de funciones que realizaran los inserts en la BD con hibernate, después de cada inserción debe mostrar un mensaje por pantalla.

a. Modulo (nombre, código):
• Programacion B, M03B
• Acceso a Datos, M06
• Desarrollo de aplicaciones moviles, M08
• Servicios y procesos, M09

Mensaje por pantalla:
Insert into modulo, nombre: {nombre}, codigo {codigo}

Ejemplo:
Insert into modulo, nombre: Programacion B, codigo: M03B

b. Profesor (nombre, sexo)

• Alvaro, Hombre

Mensaje por pantalla:

Insert into profesor, nombre: {nombre}, sexo: {sexo}

Ejemplo:

Insert into profesor, nombre: Alvaro, sexo: Hombre
c. Alumno (nombre, nacionalidad, edad, sexo, set<módulos>)
• Juan, Espaniola, 26, Hombre, Módulos (1,2,3,4)
• Pedro, Andorrana, 21, Hombre, Módulos (1,2,4)
• Marta, Espaniola, 19, Mujer, Módulos (3,4)
• Carla, Francesa, 35, Mujer, Módulos (2,3,4)

Mensaje por pantalla:

Insert into alumno, nombre: {nombre}, nacionalidad: {nacionalidad}, edad: {edad}, sexo: {sexo}, módulos: {nº módulos}

Ejemplo:

Insert into alumno, nombre: Juan, nacionalidad: Espaniola, edad 26, sexo: Hombre, modulos: 4

5. Creación de una clase con nombre Main donde se realizará la conexión con Hibernate, se ejecutaran las funciones de insert anteriores.
