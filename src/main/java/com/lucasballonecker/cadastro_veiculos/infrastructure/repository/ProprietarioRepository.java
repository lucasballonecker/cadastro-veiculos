package com.lucasballonecker.cadastro_veiculos.infrastructure.repository;

import com.lucasballonecker.cadastro_veiculos.infrastructure.entity.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
}
