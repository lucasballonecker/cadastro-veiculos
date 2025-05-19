package com.lucasballonecker.cadastro_veiculos.infrastructure.repository;

import com.lucasballonecker.cadastro_veiculos.infrastructure.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
