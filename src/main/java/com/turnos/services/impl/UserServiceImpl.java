package com.turnos.services.impl;
import org.springframework.stereotype.Service;
import com.turnos.domain.Usuario;
import com.turnos.repository.UserRepository;
import com.turnos.services.UserService;

// Uso de lombok
@Service
public class UserServiceImpl implements UserService{

	//DI
	private final UserRepository repository;
	
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void crearUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}



}
