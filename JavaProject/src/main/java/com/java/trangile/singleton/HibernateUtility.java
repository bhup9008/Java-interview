package com.java.trangile.singleton;

public class HibernateUtility {
    public static SessionFactory factory;
//to disallow creating objects by other classes.

    private HibernateUtility() {
    }
//maling the Hibernate SessionFactory object as singleton

    public static synchronized SessionFactory getSessionFactory() {

        if (factory == null) {
            /*factory = new Configuration().configure("hibernate.cfg.xml").
                    buildSessionFactory();*/
            factory=new SessionFactory();
        }
        return factory;
    }
}
