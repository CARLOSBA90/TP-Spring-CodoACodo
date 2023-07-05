package com.turnos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.turnos.domain.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long>{
 
}
