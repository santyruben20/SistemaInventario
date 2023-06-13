package erp.inventario.roles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Es una ruta de acceso para manejar solicitudes http
@RequestMapping("/api/roles")
//Nos permite controlar solicitudes de recursos crusados
@CrossOrigin({"*"})
public class RolesController {

@Autowired
RolesService service;

//Get

@GetMapping("/")
public List<Roles> findAll(){
return service.findAll();
}

//Create
@PostMapping("/")
public Roles save (@RequestBody Roles entity){
    return service.save(entity);
}

//update
@PutMapping("/")
public Roles update (@RequestBody Roles entity){
    return service.save(entity);
}

//delete
@DeleteMapping("/")
public void deeteById(@PathVariable long id){
    service.deleteById(id);
}

}