package erp.inventario.clientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/api/cliente")
//Nos permite controlar solicitudes de recursos crusados
@CrossOrigin({"*"})
public class ClienteController {

@Autowired
ClienteService service;

//Get
@PreAuthorize("hasAuthority('Clientes_leerTodos')")
@GetMapping("/")
public List<Cliente> findAll(){
return service.findAll();
}

//Create
@PreAuthorize("hasAuthority('Cliente')")
@PostMapping("/")
public Cliente save (@RequestBody Cliente entity){
    return service.save(entity);
}

//update
@PutMapping("/")
public Cliente update (@RequestBody Cliente entity){
    return service.save(entity);
}

//delete
@DeleteMapping("/{id}/")
public void deeteById(@PathVariable long id){
    service.deleteById(id);
}

}
