package com.tavares.gerenciamentofornecedores.models;

import jakarta.persistence.*;

@Entity
@Table(name="tb_fornecedor")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;

    @Column(name="apelido")
    private String nomeFantasia;

    private String cnpj;

    @Column(name="contato_fornecedor")
    private String contato;

    public Fornecedor(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}