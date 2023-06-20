package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.Role;
import pe.edu.upc.egymbackend.repositories.RoleRepository;
import pe.edu.upc.egymbackend.services.IRoleService;

import java.util.List;
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        //TODO Auto-generated method stub
        return rR.findAll();
    }
}
