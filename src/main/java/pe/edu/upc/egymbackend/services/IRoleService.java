package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);
    List<Role>list();
}
