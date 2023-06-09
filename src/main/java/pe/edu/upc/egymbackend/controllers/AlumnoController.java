package pe.edu.upc.egymbackend.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.AlumnoDTO;
import pe.edu.upc.egymbackend.entities.Alumno;
import pe.edu.upc.egymbackend.services.IAlumnoService;

import java.util.List;
import java.util.stream.Collectors;
//@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    private IAlumnoService aS;
    @PostMapping
    @PreAuthorize("hasAuthority('ALUMNO')")
    public void insert(@RequestBody AlumnoDTO dto){
        ModelMapper m=new ModelMapper();
        Alumno a=m.map(dto,Alumno.class);
        aS.insert(a);
    }
    @GetMapping
    @PreAuthorize("hasAnyAuthority('ALUMNO','ENTRENADOR','NUTRICIONISTA','ADMIN')")
    public List<AlumnoDTO> list(){
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,AlumnoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ALUMNO','ADMIN')")
    public void delete(@PathVariable("id") Integer id){
        aS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ALUMNO')")
    public AlumnoDTO lisId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        AlumnoDTO dto=m.map(aS.listId(id),AlumnoDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ALUMNO')")
    public void goUpdate(@RequestBody AlumnoDTO dto){
        ModelMapper m=new ModelMapper();
        Alumno a=m.map(dto,Alumno.class);
        aS.insert(a);
    }
}
