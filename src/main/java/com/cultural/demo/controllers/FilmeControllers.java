package com.cultural.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cultural.demo.models.Filme;

@RestController
public class FilmeControllers {
    List<Filme> listaDFilmes = new ArrayList<>();

    @PostMapping("/filme")
    public void salvarFilme(@RequestBody Filme filmeRecebido) {
        listaDFilmes.add(filmeRecebido);
    }

    @GetMapping("/filme")
    @ResponseBody
    public List<Filme> coletarFilmes() {
        return listaDFilmes;
    }

}