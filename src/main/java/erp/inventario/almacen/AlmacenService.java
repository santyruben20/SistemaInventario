package erp.inventario.almacen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlmacenService {

@Autowired
AlmacenRepository repository;
//CRUD
//Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
//Create
public Almacen save(Almacen entity){
    return repository.save(entity);
}

//get

public List<Almacen> findAll(){
    return repository.findAll();
}

//update

public Almacen findById(long id){
    return repository.findById(id).orElse(null);
}

//delete
public void deleteById(long id){
    repository.deleteById(id);
}


}