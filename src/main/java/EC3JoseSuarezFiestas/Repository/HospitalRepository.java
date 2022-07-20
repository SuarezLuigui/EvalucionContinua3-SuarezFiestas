package EC3JoseSuarezFiestas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import EC3JoseSuarezFiestas.Model.Cliente;
import EC3JoseSuarezFiestas.Model.Hospital;

@RepositoryRestResource(path = "hospital")
public interface HospitalRepository extends JpaRepository<Cliente,Integer>{

	void save(Hospital h);

	void saveAndFlush(Hospital h);

}

