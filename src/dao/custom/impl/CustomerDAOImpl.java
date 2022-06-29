package dao.custom.impl;

import dao.custom.CustomerDAO;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean add(Customer entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Customer entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.load(Customer.class, s);

        session.delete(customer);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Customer find(String s) throws Exception {
        return null;
    }

    @Override
    public List<Customer> findAll() throws Exception {
        return null;
    }
}
