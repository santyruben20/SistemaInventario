package erp.inventario.usuarios;

import java.math.BigDecimal;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Usuarios {
//Delimitador de acceso, tipo de dato, nombre del atributo, cierre con punto y como;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String nombre;
private String correo_electronico;
private String contraseña;

}
