package pac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Mensaje de comprobación
        System.out.println("Iniciando el programa....");

        //Creación de una nueva configuración para Hibernate
        Configuration cfg = new Configuration().configure();

        //Recuperamos la factoría de sesiones (1 único sesion factory en la aplicación)
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());

        //Abrimos la sesion
        Session session = sessionFactory.openSession();

        //Mensaje de comprobación
        System.out.println("Configuración realizada");

        //Creo los abjectos de tipo módulo

        Modulo m03b = new Modulo();
        m03b.setNombre("Programacion B");
        m03b.setCódigo("M03B");

        Modulo m06 = new Modulo();
        m06.setNombre("Acceso a Datos");
        m06.setCódigo("M06");

        Modulo m08 = new Modulo();
        m08.setNombre("Desarrollo de aplicaciones moviles");
        m08.setCódigo("M08");

        Modulo m09 = new Modulo();
        m09.setNombre("Servicios y procesos");
        m09.setCódigo("M09");

        //Llamada a las funciones para introducir registros en la bbdd

        insertModulo(m03b, session);
        insertModulo(m06, session);
        insertModulo(m08, session);
        insertModulo(m09, session);

        insertProfesor("Alvaro", "Hombre", session);

        //Creación de los set de módulos para los alumnos

        Set <Modulo> setJuan = new HashSet<>();
        setJuan.add(m03b);
        setJuan.add(m06);
        setJuan.add(m08);
        setJuan.add(m09);

        Set <Modulo> setPedro = new HashSet<>();
        setPedro.add(m03b);
        setPedro.add(m06);
        setPedro.add(m09);

        Set <Modulo> setMarta = new HashSet<>();
        setMarta.add(m08);
        setMarta.add(m09);

        Set <Modulo> setCarla = new HashSet<>();
        setCarla.add(m06);
        setCarla.add(m08);
        setCarla.add(m09);

        //Insercciones de alumnos

        insertAlumno("Juan", "Espaniola", 26,"Hombre", setJuan, session);
        insertAlumno("Pedro", "Andorrana", 21,"Hombre", setPedro, session);
        insertAlumno("Marta", "Espaniola", 19,"Mujer", setMarta, session);
        insertAlumno("Carla", "Francesa", 35,"Mujer", setCarla, session);

        //Cerramos sesión y sessionFactory
        session.close();
        sessionFactory.close();
    }

    //Funciones para realizar los inserts en la bbd con Hibernate

    //Función para introducir módulos en la tabla módulo de la bbdd
    static void insertModulo (Modulo m, Session session){
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
        System.out.println("Insert into modulo, nombre: " + m.getNombre() + ", codigo: " + m.getCódigo());
    }

    //Función para introducir un profesores en la tabla módulo de la bbdd
    static void insertProfesor (String nombre, String sexo, Session session){
        Profesor p = new Profesor();
        p.setNombre(nombre);
        p.setSexo(sexo);
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        System.out.println("Insert into profesor, nombre: " + nombre + ", sexo: " + sexo);
    }

    //Función para introducir un alumno en la tabla módulo de la bbdd
    static void insertAlumno (String nombre, String nacionalidad, int edad, String sexo, Set <Modulo> modulos , Session session){
        Alumno a = new Alumno();
        a.setNombre(nombre);
        a.setNacionalidad(nacionalidad);
        a.setEdad(edad);
        a.setSexo(sexo);
        a.setModulos(modulos);
        session.beginTransaction();
        session.save(a);
        session.getTransaction().commit();
        System.out.println("Insert into alumno, nombre: " + nombre +  ", nacionalidad: " + nacionalidad + ", edad: " + edad + ", sexo: " + sexo + ", modulos: " + modulos.size());
    }
}
