package br.com.solucionweb.feriavirtual2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.solucionweb.feriavirtual2.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
