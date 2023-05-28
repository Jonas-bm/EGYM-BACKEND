package pe.edu.upc.egymbackend.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.AlumnoDTO;
import pe.edu.upc.egymbackend.entities.Alumno;
import pe.edu.upc.egymbackend.services.IAlumnoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    private IAlumnoService aS;
    @PostMapping
    public void insert(@RequestBody AlumnoDTO dto){
        ModelMapper m=new ModelMapper();
        Alumno a=m.map(dto,Alumno.class);
        aS.insert(a);
    }
    @GetMapping
    public List<AlumnoDTO> list(){
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,AlumnoDTO.class);
        }).collect(Collectors.toList());
    }
}
