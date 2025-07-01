package com.dio.demand.microservico_pedidos.service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.dio.demand.microservico_pedidos.dto.ProdutoDTO;
import com.dio.demand.microservico_pedidos.model.Pedido;

@Service
public class PedidoService {

    private final WebClient webClient;
    private final Map<Long, Pedido> pedidos = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public PedidoService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<ProdutoDTO> listarProdutos() {
        return Arrays.asList(
                webClient.get()
                        .uri("/produtos")
                        .retrieve()
                        .bodyToMono(ProdutoDTO[].class)
                        .block());
    }

    public Pedido criarPedido(List<ProdutoDTO> produtos) {
        Pedido pedido = new Pedido();
        pedido.setId(idGenerator.incrementAndGet());
        pedido.setProdutos(produtos);
        pedidos.put(pedido.getId(), pedido);
        return pedido;
    }

    public Optional<Pedido> buscarPedido(Long id) {
        return Optional.ofNullable(pedidos.get(id));
    }
}
