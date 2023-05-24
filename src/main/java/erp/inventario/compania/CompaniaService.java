package erp.inventario.compania;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompaniaService {

@Autowired
CompaniaRepository repository;
//CRUD
//Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
//Create
public Compania save(Compania entity){
    return repository.save(entity);
}

//get

public List<Compania> findAll(){
    return repository.findAll();
}

//update

public Compania findById(long id){
    return repository.findById(id).orElse(null);
}

//delete
public void deleteById(long id){
    repository.deleteById(id);
}


}