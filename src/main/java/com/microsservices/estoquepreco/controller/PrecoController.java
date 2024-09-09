package com.microsservices.estoquepreco.controller;

import com.microsservices.estoquepreco.constantes.RabbitmqConstantes;
import com.microsservices.estoquepreco.dto.PrecoDto;
import com.microsservices.estoquepreco.service.RabbitmqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "preco")
public class PrecoController {

    @Autowired
    private RabbitmqService service;

    @PutMapping
    private ResponseEntity alteraPreco(@RequestBody PrecoDto precoDto) {
        this.service.enviaMensagem(RabbitmqConstantes.FILA_PRECO, precoDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
