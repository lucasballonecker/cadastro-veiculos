package com.lucasballonecker.cadastro_veiculos.services;

import com.lucasballonecker.cadastro_veiculos.controller.dto.CadastroDTO;
import com.lucasballonecker.cadastro_veiculos.controller.dto.DadosGeraisDTO;
import com.lucasballonecker.cadastro_veiculos.controller.dto.LicenciamentoDTO;
import com.lucasballonecker.cadastro_veiculos.infrastructure.client.LicenciamentoClient;
import com.lucasballonecker.cadastro_veiculos.infrastructure.entity.Proprietario;
import com.lucasballonecker.cadastro_veiculos.infrastructure.entity.Veiculo;
import com.lucasballonecker.cadastro_veiculos.infrastructure.repository.ProprietarioRepository;
import com.lucasballonecker.cadastro_veiculos.infrastructure.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CadastroVeiculoService {
    private final LicenciamentoClient licenciamentoClient;
    private final ProprietarioRepository proprietarioRepository;
    private final VeiculoRepository veiculoRepository;

    public DadosGeraisDTO cadastrarVeiculo(CadastroDTO cadastroDTO) {
        LicenciamentoDTO licenciamentoDTO = licenciamentoClient.licenciamento(cadastroDTO.placa());
        return salvarDados(licenciamentoDTO, cadastroDTO);
    }

    public DadosGeraisDTO salvarDados(LicenciamentoDTO licenciamentoDTO, CadastroDTO cadastroDTO) {
        Proprietario proprietario = new Proprietario(cadastroDTO.proprietario(), cadastroDTO.cpf());
        proprietarioRepository.save(proprietario);

        Veiculo veiculo = new Veiculo(cadastroDTO.placa(), licenciamentoDTO.marca()
                , licenciamentoDTO.modelo(), licenciamentoDTO.chassi(), licenciamentoDTO.licenciado(),proprietario);
        veiculoRepository.save(veiculo);

        return new DadosGeraisDTO(proprietario.getId(), proprietario.getProprietario(), proprietario.getCpf()
                , veiculo.getPlaca(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getChassi()
                , veiculo.getLicenciado());
    }
}

