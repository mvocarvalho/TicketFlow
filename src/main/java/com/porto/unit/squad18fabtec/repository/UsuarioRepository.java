package com.porto.unit.squad18fabtec.repository;

import com.porto.unit.squad18fabtec.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
