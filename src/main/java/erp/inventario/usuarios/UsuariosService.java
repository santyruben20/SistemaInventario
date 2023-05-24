package erp.inventario.usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {

@Autowired
UsuariosRepository repository;
//CRUD
//Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
//Create
public Usuarios save(Usuarios entity){
    return repository.save(entity);
}

//get

public List<Usuarios> findAll(){
    return repository.findAll();
}

//update

public Usuarios findById(long id){
    return repository.findById(id).orElse(null);
}

//delete
public void deleteById(long id){
    repository.deleteById(id);
}


}
