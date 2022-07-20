package EC3JoseSuarezFiestas.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC3JoseSuarezFiestas.DTO.ClienteDTORequest;
import EC3JoseSuarezFiestas.DTO.ClienteDTOResponse;
import EC3JoseSuarezFiestas.Model.Cliente;
import EC3JoseSuarezFiestas.Repository.ClienteRepository;

	
@Service
public class ClienteServiceImpl implements ClienteService {

	    @Autowired
	    private ClienteRepository repository;

	    @Override
	    public void guardarCliente(ClienteDTORequest Cliente) {

	        Cliente c = new Cliente();
	        c.setIdCliente(Cliente.getIdCliente());
	        c.setNombre(c.getNombre());
	        c.setCelular(c.getCelular());

	        repository.save(c);
	    }

	    @Override
	    public void actualizarCliente(ClienteDTORequest Cliente) {
	        // TODO Auto-generated method stub

	        Cliente c = new Cliente();
	        c.setIdCliente(Cliente.getIdCliente());
	        c.setNombre(c.getNombre());
	        c.setCelular(c.getCelular());


	        repository.saveAndFlush(c);
	    }

	    @Override
	    public void eliminarCliente(Integer id) {
	        // TODO Auto-generated method stub
	        repository.deleteById(id);
	    }

	    @Override
	    public List<ClienteDTOResponse> listarClientes() {

	        List<ClienteDTOResponse> listar = new ArrayList<>();

	        ClienteDTOResponse dto = null;

	        List<Cliente> c = repository.findAll();

	        for (Cliente Cliente : c) {

	            dto = new ClienteDTOResponse();

	            dto.setNombre(dto.getNombre());
		        dto.setCelular(dto.getCelular());


	            listar.add(dto);
	        }

	        return listar;
	    }


	    @Override
	    public ClienteDTOResponse obtenerClienteId(Integer id) {
	        // TODO Auto-generated method stub

	        Cliente Cliente = repository.findById(id).orElse(null);
	        ClienteDTOResponse dto = new ClienteDTOResponse();

	        dto.setNombre(dto.getNombre());
	        dto.setCelular(dto.getCelular());

	        return dto;
	    }
	}
 
