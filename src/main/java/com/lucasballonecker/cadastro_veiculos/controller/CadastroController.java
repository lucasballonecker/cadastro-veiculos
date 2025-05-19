package com.lucasballonecker.cadastro_veiculos.controller;

import com.lucasballonecker.cadastro_veiculos.controller.dto.CadastroDTO;
import com.lucasballonecker.cadastro_veiculos.controller.dto.DadosGeraisDTO;
import com.lucasballonecker.cadastro_veiculos.services.CadastroVeiculoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/veiculos")
public class CadastroController {
    private final CadastroVeiculoService cadastroVeiculoService;

    @PostMapping
    public ResponseEntity<DadosGeraisDTO> cadastrarVeiculo(@Valid @RequestBody CadastroDTO cadastroDTO) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(cadastroVeiculoService.cadastrarVeiculo(cadastroDTO));
    }

}

