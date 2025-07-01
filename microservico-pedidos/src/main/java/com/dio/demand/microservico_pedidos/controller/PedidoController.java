package com.dio.demand.microservico_pedidos.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dio.demand.microservico_pedidos.dto.ProdutoDTO;
import com.dio.demand.microservico_pedidos.model.Pedido;
import com.dio.demand.microservico_pedidos.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/produtos")
    public List<ProdutoDTO> listarProdutos() {
        return pedidoService.listarProdutos();
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody List<ProdutoDTO> produtos) {
        return pedidoService.criarPedido(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPedido(@PathVariable Long id) {
        return pedidoService.buscarPedido(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
