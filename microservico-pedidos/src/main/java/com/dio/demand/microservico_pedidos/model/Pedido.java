package com.dio.demand.microservico_pedidos.model;

import java.util.List;

import com.dio.demand.microservico_pedidos.dto.ProdutoDTO;

public class Pedido {
    private Long id;
    private List<ProdutoDTO> produtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }
}
