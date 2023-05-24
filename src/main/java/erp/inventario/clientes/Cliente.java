package erp.inventario.clientes;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;
@Data
@Entity
public class Cliente {
//Delimitador de acceso, tipo de dato, nombre del atributo, cierre con punto y como;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String nombre;
private LocalDate fechaNacimiento;
private BigDecimal precio;
private String direccion;
private String correoElectronico;
}
