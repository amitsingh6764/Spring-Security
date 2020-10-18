package com.amit.Hibernate;
import java.io.IOException;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.amit.Hibernate.model.Employee;

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws IOException
    {

    	Configuration conn = new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory sf = conn.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        SQLQuery query=session.createSQLQuery("SELECT SUM(salary) AS Sum FROM Employee");
        Object  obj = query.uniqueResult();
        System.out.println(obj);
        session.getTransaction().commit();
        session.close();

    }
}
