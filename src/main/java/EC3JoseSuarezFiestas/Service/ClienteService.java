package EC3JoseSuarezFiestas.Service;

import java.util.List;

import EC3JoseSuarezFiestas.DTO.ClienteDTORequest;
import EC3JoseSuarezFiestas.DTO.ClienteDTOResponse;

public interface ClienteService {

	
	 void guardarCliente(ClienteDTORequest cliente);
	 void actualizarCliente(ClienteDTORequest cliente);
	 void eliminarCliente(Integer id);
	 List<ClienteDTOResponse> listarClientes();
	 ClienteDTOResponse obtenerClienteId(Integer id);
}
