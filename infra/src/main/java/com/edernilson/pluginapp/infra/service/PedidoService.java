package com.edernilson.pluginapp.infra.service;

import com.edernilson.pluginapp.infra.dto.PedidoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PedidoService {

    List<PedidoDTO> findAll();
}
