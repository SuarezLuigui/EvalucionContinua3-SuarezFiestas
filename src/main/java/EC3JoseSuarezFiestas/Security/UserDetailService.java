package EC3JoseSuarezFiestas.Security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import EC3JoseSuarezFiestas.Model.UsuarioCliente;
import EC3JoseSuarezFiestas.Repository.UsuarioClienteRepository;



public class UserDetailService implements UserDetailsService{

	@Autowired
	private UsuarioClienteRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UsuarioCliente usuario = repository.findByUsuario(username);
		
		if(usuario != null){
			
			List<GrantedAuthority> listGranted = new ArrayList<>();
			GrantedAuthority granted = new SimpleGrantedAuthority(usuario.getRol());
			
			listGranted.add(granted);
			
			return new User(Usuario(),usuario.getPassword() , listGranted);
			
		}else
			throw new UsernameNotFoundException("Usuario no existe " + username);
	}

	private String Usuario() {
		// TODO Auto-generated method stub
		return null;
	}


}
