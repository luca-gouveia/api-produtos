package com.produtos.apirest.repository;

import com.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

//persistência no banco
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findById(long id);
}
