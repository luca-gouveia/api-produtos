package com.produtos.apirest.resources;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*") // Qualquer dominio pode acessar esse api, usando *

public class ProdutoResource {
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    @ApiOperation(value = "Retorna uma lista de produtos")
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{id}")
    @ApiOperation(value = "Retorna um produto do banco")
    public Produto listarProdutoUnico(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }

    //    @RequestBody oque vem no corpo da requisicao
    @PostMapping("/produto")
    @ApiOperation(value = "Salva um produto no banco")
    public Produto salvarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    @ApiOperation(value = "Deleta um produto no banco")
    public void deletarProduto(@RequestBody Produto produto) {
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    @ApiOperation(value = "Atualiza um produto no banco")
    public Produto atualizarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
