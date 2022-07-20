package EC3JoseSuarezFiestas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import EC3JoseSuarezFiestas.Model.UsuarioCliente;

@RepositoryRestResource(path = "usuario-cliente")
public interface UsuarioClienteRepository  extends JpaRepository<UsuarioCliente,Integer>{

	UsuarioCliente findByUsuario(String usuario);

	


}
