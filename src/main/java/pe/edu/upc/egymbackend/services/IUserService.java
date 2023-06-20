package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.Users;

import java.util.List;




public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();

}
