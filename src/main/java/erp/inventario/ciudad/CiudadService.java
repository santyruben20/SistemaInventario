package erp.inventario.ciudad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadService {

@Autowired
CiudadRepository repository;
//CRUD
//Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
//Create
public Ciudad save(Ciudad entity){
    return repository.save(entity);
}

//get

public List<Ciudad> findAll(){
    return repository.findAll();
}

//update

public Ciudad findById(long id){
    return repository.findById(id).orElse(null);
}

//delete
public void deleteById(long id){
    repository.deleteById(id);
}


}