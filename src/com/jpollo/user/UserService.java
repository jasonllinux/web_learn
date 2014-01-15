package com.jpollo.user;

import org.hibernate.Session;
import  org.hibernate.SessionFactory;


/**
 * Created by shenjie on 14-1-2.
 */

public class UserService {

    private SessionFactory factory = null;

    public SessionFactory getFactory() {
        return factory;
    }


    public void setFactory(SessionFactory factory) {
       this.factory = factory;
    }


    public User save(User user) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();;
        return user;
    }


}
