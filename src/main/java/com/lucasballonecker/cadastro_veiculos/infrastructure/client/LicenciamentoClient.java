package com.lucasballonecker.cadastro_veiculos.infrastructure.client;

import com.lucasballonecker.cadastro_veiculos.controller.dto.LicenciamentoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "https://my.api.mockaroo.com", name = "licenciamento")
public interface LicenciamentoClient {
    @GetMapping("/veiculos?key=55ad1cd0")
    LicenciamentoDTO licenciamento(@RequestParam(name = "placa") String placa);
}

