package com.bedirhansaglam.yazilim.dao;


import java.util.List;
import com.bedirhansaglam.yazilim.object.Yonetici;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class YoneticiDao {


	
	public  int register(Yonetici y){  
		 int i=0;  
		 
		 Session session=new Configuration().configure("com/bedirhansaglam/yazilim/hibernate/config/hibernate.cfg.xml").addAnnotatedClass(com.bedirhansaglam.yazilim.object.Yonetici.class).
         buildSessionFactory().openSession(); 
		 Transaction t=session.beginTransaction();  
		  i=(Integer)session.save(y);      
		  t.commit();  
		  session.close();  
		  return i;  
		 }  
	
	public List getAllData()
	{
		List yoneticiler=null;
		Session session=new Configuration().configure("com/bedirhansaglam/yazilim/hibernate/config/hibernate.cfg.xml").addAnnotatedClass(com.bedirhansaglam.yazilim.object.Yonetici.class).
		         buildSessionFactory().openSession(); 
	      Transaction tx = null;
	      try {
	         tx = session.beginTransaction();
	         yoneticiler = session.createQuery("FROM Yonetici").list();
	         tx.commit();
	         return yoneticiler;
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }

	      return yoneticiler;	
	}
	
	public Yonetici getYonetici(int adminID)
	{
		Yonetici yonetici=new Yonetici();
		Session session=new Configuration().configure("com/bedirhansaglam/yazilim/hibernate/config/hibernate.cfg.xml").addAnnotatedClass(com.bedirhansaglam.yazilim.object.Yonetici.class).
		         buildSessionFactory().openSession(); 
	      Transaction tx = null;
	      try {
	         tx = session.beginTransaction();
	         yonetici = (Yonetici)session.get(Yonetici.class,adminID);
	         tx.commit();
	         return yonetici;
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return yonetici;	
	}
	
	public boolean updateYonetici(Yonetici y)
	{
		Yonetici yonetici=y;
		Session session=new Configuration().configure("com/bedirhansaglam/yazilim/hibernate/config/hibernate.cfg.xml").addAnnotatedClass(com.bedirhansaglam.yazilim.object.Yonetici.class).
		         buildSessionFactory().openSession(); 
	      Transaction tx = null;
	      try {
	         tx = session.beginTransaction();
	         session.update(yonetici);
	         tx.commit();
	         return true;
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return false;
	}
	public boolean deleteYonetici(int adminID)
	{
		Yonetici yonetici=new Yonetici();
		Session session=new Configuration().configure("com/bedirhansaglam/yazilim/hibernate/config/hibernate.cfg.xml").addAnnotatedClass(com.bedirhansaglam.yazilim.object.Yonetici.class).
		         buildSessionFactory().openSession(); 
	      Transaction tx = null;
	      try {
	         tx = session.beginTransaction();
	         yonetici = (Yonetici)session.get(Yonetici.class,adminID);
	         session.delete(yonetici);
	         tx.commit();
	         return true;
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return false;	
	}
}
