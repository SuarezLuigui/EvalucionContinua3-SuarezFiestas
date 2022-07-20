package EC3JoseSuarezFiestas.Service;

import java.util.List;

import EC3JoseSuarezFiestas.DTO.UsuarioClienteDTORequest;
import EC3JoseSuarezFiestas.DTO.UsuarioClienteDTOResponse;

public interface UsuarioClienteService {
	
	void guardarUsuarioCliente(UsuarioClienteDTORequest UsuarioCliente);
    void actualizarUsuarioCliente(UsuarioClienteDTORequest UsuarioCliente);
	void eliminarUsuarioCliente(Integer id);
	List<UsuarioClienteDTOResponse> listarUsuarioCliente();
	UsuarioClienteDTOResponse obtenerUsuarioClienteId(Integer id);


}
