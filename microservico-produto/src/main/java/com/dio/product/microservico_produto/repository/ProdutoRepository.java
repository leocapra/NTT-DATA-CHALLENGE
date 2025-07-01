package com.dio.product.microservico_produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dio.product.microservico_produto.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
