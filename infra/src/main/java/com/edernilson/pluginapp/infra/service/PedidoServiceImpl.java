package com.edernilson.pluginapp.infra.service;

import com.edernilson.pluginapp.infra.dto.PedidoDTO;
import com.edernilson.pluginapp.infra.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository repo;

    @Override
    public List<PedidoDTO> findAll() {
        return repo.findAll().stream().map(PedidoDTO::newPedido).collect(Collectors.toList());
    }
}
