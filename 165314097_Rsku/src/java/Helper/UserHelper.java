/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import POJOs.User;
import org.hibernate.Query;
import org.hibernate.Session;
import util.RskuHibernateUtil;


/**
 *
 * @author Acer
 */
public class UserHelper {

    public UserHelper() {

    }
    public User Login(String email, String password) {
        Session session = RskuHibernateUtil.getSessionFactory().openSession();
        String q = "From User u where u.email=:email AND u.password =:password";
        Query query = session.createQuery(q);
        query.setParameter("email", email);
        query.setParameter("password", password);

        return (User) query.uniqueResult();
    }

}
