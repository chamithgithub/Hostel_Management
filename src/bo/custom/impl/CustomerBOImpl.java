package bo.custom.impl;


import bo.custom.CustomerBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.custom.impl.CustomerDAOImpl;
import dto.CustomerDTO;
import entity.Customer;

public class CustomerBOImpl implements CustomerBO {

    CustomerDAOImpl customerDAO = DAOFactory.getInstance().getDAO(DAOType.CUSTOMER);

    @Override
    public boolean add(CustomerDTO customerDTO) throws Exception {
        return customerDAO.add(new Customer(
                customerDTO.getId(),
                customerDTO.getFullName(),
                customerDTO.getAddress()
        ));
    }

    @Override
    public boolean update(CustomerDTO customerDTO) throws Exception {
        return customerDAO.update(new Customer(
                customerDTO.getId(),
                customerDTO.getFullName(),
                customerDTO.getAddress()
        ));
    }

    @Override
    public boolean delete(String id) throws Exception {
        return customerDAO.delete(id);
    }

}
