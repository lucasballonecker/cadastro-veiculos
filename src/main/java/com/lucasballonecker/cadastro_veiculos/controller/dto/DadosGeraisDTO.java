package com.lucasballonecker.cadastro_veiculos.controller.dto;

public record DadosGeraisDTO(Long id, String proprietario, String cpf, String placa, String marca,
                             String modelo, String chassi, Boolean licenciado) {
}
