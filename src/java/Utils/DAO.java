/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.ArrayList;
import java.util.List;
import model.Group;
import model.User;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author edson
 */
public class DAO {

    public static Session session;
    public static Transaction tx;

    private static String completeUserList = "from User";
    private static String completeGroupList = "from Group";

    // Configuração do DAO
    public static Session getSession() {
        return session;
    }

    public static void setSession(Session session) {
        DAO.session = session;
    }

    public static Transaction getTx() {
        return tx;
    }

    public static void setTx(Transaction tx) {
        DAO.tx = tx;
    }

    public static void openSession() {
        session = HibernateUtil.currentSession();
        tx = session.beginTransaction();
    }

    public static void closeSession() {
        session.close();
    }

    private static List executeHQLQuery(String query) {

        session.clear();

        List resultat = null;
        try {

            if (session.isOpen()) {
                System.out.println("SESSION OK");
            }
            Query q = session.createQuery(query);

            System.out.println("executeHQLQuery: " + query);
            resultat = q.list();

            System.out.println("Tamanho lista: " + q.list().size());

        } catch (HibernateException he) {

            System.out.println("executeHQLQuery: ERRO HQL QUERY");
            System.out.println(query);
            he.printStackTrace();
        }
        return resultat;
    }

    // Users list
    public static void listUsers(ArrayList<User> usersList) {

        //openSession();
        
        List result = executeHQLQuery(completeUserList);
        User u;
        for (Object o : result) {
            u = (User) o;
            usersList.add(u);

//            //Teste
//            System.out.println(u.getNome());
        }

        //closeSession();
    }
    
        // Groups list
    public static void listGroups(ArrayList<Group> groupsList) {

        //openSession();
        
        List result = executeHQLQuery(completeGroupList);
        Group g;
        for (Object o : result) {
            g = (Group) o;
            groupsList.add(g);

//            //Teste
           System.out.println(g.getGroupName());
        }

        //closeSession();
    }


}
