package EC3JoseSuarezFiestas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import EC3JoseSuarezFiestas.Model.Cliente;

@RepositoryRestResource(path = "cliente")
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
