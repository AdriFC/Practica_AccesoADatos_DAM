package pac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

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

        //Cerramos sesión y sessionFactory
        session.close();
        sessionFactory.close();
    }
}
