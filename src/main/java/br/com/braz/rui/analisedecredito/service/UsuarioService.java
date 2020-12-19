package br.com.braz.rui.analisedecredito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.braz.rui.analisedecredito.domain.Usuario;
import br.com.braz.rui.analisedecredito.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario cadastrarUsuario(Usuario usuario) {
		
		usuarioRepository.save(usuario);		
		return usuario;
		
	}
	

}
