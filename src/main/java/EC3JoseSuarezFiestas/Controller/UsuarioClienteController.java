package EC3JoseSuarezFiestas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import EC3JoseSuarezFiestas.DTO.UsuarioClienteDTORequest;
import EC3JoseSuarezFiestas.DTO.UsuarioClienteDTOResponse;
import EC3JoseSuarezFiestas.Service.UsuarioClienteService;


@RestController
public class UsuarioClienteController {
	
	
	 @Autowired
	    private UsuarioClienteService service;

	    @RequestMapping("/listar")
	    public @ResponseBody
	    ResponseEntity<List<UsuarioClienteDTOResponse>> listar() {

	        return new ResponseEntity<List<UsuarioClienteDTOResponse>>(service.listarUsuarioCliente(), HttpStatus.OK) ;
	    }

	    @RequestMapping( path = "/guardar", method = RequestMethod.POST)
	    public ResponseEntity<Void> guardar(@RequestBody UsuarioClienteDTORequest UsuarioCliente) {
	        service.guardarUsuarioCliente(UsuarioCliente);
	        return  new ResponseEntity<Void>(HttpStatus.CREATED);

	    }

	    @RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
	    	UsuarioClienteDTOResponse uc =service.obtenerUsuarioClienteId(id);
	        if(uc != null) {
	            service.eliminarUsuarioCliente(id);
	            return  new ResponseEntity<Void>(HttpStatus.OK);
	        }
	        return  new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	    }

	    @RequestMapping( path = "/actualizar", method = RequestMethod.PUT)
	    public ResponseEntity<Void> actualizar(@RequestBody UsuarioClienteDTORequest UsuarioCliente) {
	    	UsuarioClienteDTOResponse uc =service.obtenerUsuarioClienteId(UsuarioCliente.getIdUsuario());
	        if(uc != null) {
	            service.actualizarUsuarioCliente(UsuarioCliente);
	            return  new ResponseEntity<Void>(HttpStatus.OK);
	        }
	        return  new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	    }

	    @RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
	    public ResponseEntity<UsuarioClienteDTOResponse> obtenerId(@PathVariable Integer id) {
	    	UsuarioClienteDTOResponse uc =service.obtenerUsuarioClienteId(id);
	        if(uc != null) {
	            return  new ResponseEntity<UsuarioClienteDTOResponse>(service.obtenerUsuarioClienteId(id),HttpStatus.OK);
	        }
	        return  new ResponseEntity<UsuarioClienteDTOResponse>(HttpStatus.NOT_FOUND);
	    }
	

	

}
