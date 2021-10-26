package com.edernilson.pluginapp.infra.dto;

import com.edernilson.pluginapp.infra.model.Pedido;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

@Data
public class PedidoDTO implements Serializable {

    private static final long serialVersionUID = -4633034571873427345L;
    private Date data;
    private String numero;
    private Map<String, String> atributos;

    private PedidoDTO() {}

    static public PedidoDTO newPedido(Pedido pedido) {
        PedidoDTO pedidoDTO = new PedidoDTO();
        pedidoDTO.setData(pedido.getData());
        pedidoDTO.setNumero(pedido.getNumero());
        pedidoDTO.setAtributos(pedido.getAtributos());

        return pedidoDTO;
    }

}
