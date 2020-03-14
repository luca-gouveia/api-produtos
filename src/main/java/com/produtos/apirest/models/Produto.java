package com.produtos.apirest.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_produtos")
public class Produto {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Id gerado pelo proprio banco
    private long id;
    private String nome;
    private BigDecimal quantidade;
    private BigDecimal valor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
