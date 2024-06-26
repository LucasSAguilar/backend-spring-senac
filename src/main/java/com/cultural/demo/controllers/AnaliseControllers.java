package com.cultural.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cultural.demo.models.Analise;

@RestController
public class AnaliseControllers {
    List<Analise> listaDeAnalises = new ArrayList<>();

    @PostMapping("/analise")
    public void criarAnalise(@RequestBody Analise analiseRecebida) {
        listaDeAnalises.add(analiseRecebida);
    }

    @GetMapping("/analise")
    @ResponseBody
    public List<Analise> coletarAnalises() {
        return listaDeAnalises;
    }

}