package com.lucasballonecker.cadastro_veiculos.controller.dto;

import jakarta.validation.constraints.NotBlank;

public record CadastroDTO(@NotBlank(message = "Nome não pode ser vazio") String proprietario,
                          @NotBlank(message = "Cpf não pode ser vazio")
                          String cpf, @NotBlank(message = "Placa não pode ser vazio") String placa) {

}
