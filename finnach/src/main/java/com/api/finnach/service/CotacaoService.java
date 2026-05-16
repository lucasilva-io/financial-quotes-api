package com.api.finnach.service;

import com.api.finnach.model.Cotacao;
import com.api.finnach.model.CotacaoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CotacaoService {

    private static final String URLUSD = "https://economia.awesomeapi.com.br/json/last/USD-BRL";
    private static final String URLEUR = "https://economia.awesomeapi.com.br/json/last/EUR-BRL";
    private static final String URLBTC = "https://economia.awesomeapi.com.br/json/last/BTC-BRL";

    @Autowired
    private RestTemplate restTemplate;

    public Cotacao getCotacaoDolar() {
        CotacaoResponse response = restTemplate.getForObject(URLUSD, CotacaoResponse.class);
        if (response == null || response.getUsdbrl() == null) {
            throw new RuntimeException("Erro ao buscar cotação do dólar.");
        }
        return response.getUsdbrl();
    }

    public Cotacao getCotacaoEuro() {
        CotacaoResponse response = restTemplate.getForObject(URLEUR, CotacaoResponse.class);
        if (response == null || response.getEurbrl() == null) {
            throw new RuntimeException("Erro ao buscar cotação do euro.");
        }
        return response.getEurbrl();
    }

    public Cotacao getCotacaoBitcoin() {
        CotacaoResponse response = restTemplate.getForObject(URLBTC, CotacaoResponse.class);
        if (response == null || response.getBtcbrl() == null) {
            throw new RuntimeException("Erro ao buscar cotação do bitcoin.");
        }
        return response.getBtcbrl();
    }
}
