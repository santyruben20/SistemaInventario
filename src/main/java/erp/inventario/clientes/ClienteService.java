package erp.inventario.clientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

@Autowired
ClienteRepository repository;
//CRUD
//Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
//Create
public Cliente save(Cliente entity){
    return repository.save(entity);
}

//get

public List<Cliente> findAll(){
    return repository.findAll();
}

//update

public Cliente findById(long id){
    return repository.findById(id).orElse(null);
}

//delete
public void deleteById(long id){
    repository.deleteById(id);
}


}
