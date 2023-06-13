package erp.inventario.roles;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="rolesClientes")
public class Roles {
//Delimitador de acceso, tipo de dato, nombre del atributo, cierre con punto y como;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String nombre;
private String descripcion;
}