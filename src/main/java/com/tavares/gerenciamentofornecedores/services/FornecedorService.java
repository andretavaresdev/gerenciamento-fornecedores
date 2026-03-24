package com.tavares.gerenciamentofornecedores.services;

import com.tavares.gerenciamentofornecedores.models.Fornecedor;
import com.tavares.gerenciamentofornecedores.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository repository;

    public Fornecedor salvar(Fornecedor fornecedor){
        return repository.save(fornecedor);
    }

    public List<Fornecedor> listarTodos(){
        return repository.findAll();
    }

    public Optional<Fornecedor> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
