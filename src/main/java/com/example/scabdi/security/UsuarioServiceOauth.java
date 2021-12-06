package com.example.scabdi.security;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Usuario;
import com.example.scabdi.repository.UsuarioRepository;
import com.example.scabdi.repository.RolRepository;
import com.example.scabdi.entity.Rol;

@SpringBootApplication
@Service
public class UsuarioServiceOauth implements UserDetailsService{
    @Autowired
    private UsuarioRepository usuarioRespository;
    @Autowired
	private RolRepository repository;
    @Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioRespository.findByUsername(username);
        List<Rol> roles= repository.listarRoles(usuario.getId());
		
		
      List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
      
		
		for (int i=0;i<roles.size(); i++) {
			System.out.println();
			authorities.add(new SimpleGrantedAuthority(roles.get(i).getNo_rol()));
			
		}
		
		return new User(usuario.getUsername() ,usuario.getPassword(), usuario.getEstado(), true, 
				true, true, authorities);
	}
   

}
