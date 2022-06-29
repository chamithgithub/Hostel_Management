package bo.custom;


import bo.SuperBO;
import dto.CustomerDTO;

public interface CustomerBO extends SuperBO {
    public boolean add(CustomerDTO customerDTO) throws Exception;

    public boolean update(CustomerDTO customerDTO) throws Exception;

    public boolean delete(String id) throws Exception;
}
