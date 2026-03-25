package com.tavares.gerenciamentofornecedores.controllers;

import com.tavares.gerenciamentofornecedores.models.Fornecedor;
import com.tavares.gerenciamentofornecedores.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
    @Autowired
    private FornecedorService service;

    @PostMapping
    public ResponseEntity<Fornecedor> salvar(@RequestBody Fornecedor fornecedor){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(fornecedor));
    }

    @GetMapping
    public ResponseEntity<List<Fornecedor>> listarTodos(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id)
                .map(fornecedor -> ResponseEntity.ok(fornecedor))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
