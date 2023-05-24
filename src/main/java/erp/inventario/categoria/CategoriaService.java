package erp.inventario.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

@Autowired
CategoriaRepository repository;
//CRUD
//Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
//Create
public Categoria save(Categoria entity){
    return repository.save(entity);
}

//get

public List<Categoria> findAll(){
    return repository.findAll();
}

//update

public Categoria findById(long id){
    return repository.findById(id).orElse(null);
}

//delete
public void deleteById(long id){
    repository.deleteById(id);
}


}