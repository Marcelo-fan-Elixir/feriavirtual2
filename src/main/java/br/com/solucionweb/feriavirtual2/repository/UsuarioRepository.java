package br.com.solucionweb.feriavirtual2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.solucionweb.feriavirtual2.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
	
}
