package com.turnos.services;
import com.turnos.domain.Usuario;
import com.turnos.repository.UserRepository;

public interface UserService {

	//private UserRepository repository;
	
	public void crearUsuario(Usuario usuario);
}
