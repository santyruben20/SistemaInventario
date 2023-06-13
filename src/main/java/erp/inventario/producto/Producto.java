package erp.inventario.producto;

import java.math.BigDecimal;

import erp.inventario.categoria.Categoria;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Producto {
    //Delimitador de acceso, tipo de dato, nombre del atributo, cierre con punto y como;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;

    

}
