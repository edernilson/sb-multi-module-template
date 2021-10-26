package com.edernilson.pluginapp.frontjsp.managebeans.pedido;

import com.edernilson.pluginapp.infra.dto.PedidoDTO;
import com.edernilson.pluginapp.infra.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/pedido")
@RestController
public class PedidoBean {

    private PedidoFilter pedidoFilter;
    private PedidoService pedidoService;

    public PedidoBean(PedidoFilter pedidoFilter, PedidoService pedidoService) {
        this.pedidoFilter = pedidoFilter;
        this.pedidoService = pedidoService;
    }

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<PedidoDTO> get() {
//        return Collections.emptyList();
        return pedidoService.findAll();
    }

}
