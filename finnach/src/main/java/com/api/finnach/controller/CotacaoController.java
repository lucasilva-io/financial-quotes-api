package com.api.finnach.controller;

import com.api.finnach.model.Cotacao;
import com.api.finnach.service.CotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cotacao")
public class CotacaoController {
    @Autowired
    private CotacaoService cotacaoService;

    @GetMapping("/dolar")
    public ResponseEntity<Cotacao> getCotacaoDolar() {
        Cotacao cotacao = cotacaoService.getCotacaoDolar();
        return ResponseEntity.ok(cotacao);
    }

    @GetMapping("/euro")
    public ResponseEntity<Cotacao> getCotacaoEuro() {
        Cotacao cotacao = cotacaoService.getCotacaoEuro();
        return ResponseEntity.ok(cotacao);
    }

    @GetMapping("/bitcoin")
    public ResponseEntity<Cotacao> getCotacaoBitcoin() {
        return ResponseEntity.ok(cotacaoService.getCotacaoBitcoin());
    }
}
