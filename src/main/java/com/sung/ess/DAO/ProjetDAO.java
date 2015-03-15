package com.sung.ess.DAO;
import com.sung.ess.pojo.Projet;
import com.sung.ess.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class ProjetDAO  implements IProjetDAO{
      private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    @Override
    public List<Projet> getListProjet() {
       Session session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       List list=session.createQuery("from Projet").list();
       return list;
     
    }

    @Override
    public void addProject(Projet projet) {
    
  
        
        getSessionFactory().getCurrentSession().save(projet);
    }

    @Override
    public void deleteProject(Projet projet) {

        getSessionFactory().getCurrentSession().delete(projet);
   }

    @Override
    public void edit(Projet projet) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(projet);
            session.getTransaction().commit();
            session.close();
            System.out.print("bien ajouté");
        } catch (Exception e) {
            System.out.print("erreur insertion" + e.getMessage());
        }
    }
    

}
