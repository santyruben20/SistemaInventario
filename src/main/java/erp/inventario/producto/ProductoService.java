package erp.inventario.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    
    @Autowired
    ProductoRepository repository;
    //CRUD
    //Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
    //Create
    public Producto save(Producto entity){
        return repository.save(entity);
    }

    //get

    public List<Producto> findAll(){
        return repository.findAll();
    }
    
    //update

    public Producto findById(long id){
        return repository.findById(id).orElse(null);
    }
    
    //delete
    public void deleteById(long id){
        repository.deleteById(id);
    }


}
