package EC3JoseSuarezFiestas.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "usuariocliente")
public class UsuarioCliente {
	
	@Id
	private UsuarioClientePK fk = new UsuarioClientePK();
	
	private Integer cantidad;

	private String password;

	private String rol;

	public UsuarioClientePK getFk() {
		return fk;
	}

	public void setFk(UsuarioClientePK fk) {
		this.fk = fk;
	}

	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
}

@Embeddable
class UsuarioClientePK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id_usuario", nullable = false, unique = true)
	private Integer idusuario;
	
	@Column(name = "id_cliente", nullable = false, unique = true)
	private Integer idCliente;
	
	public Integer getIdUsuario() {
		return idusuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idusuario = idUsuario;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
	
}
