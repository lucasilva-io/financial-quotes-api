package com.api.finnach.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cotacao {
    private String code;        // Ex: USD
    private String codein;      // Ex: BRL
    private String name;        // Ex: Dólar Americano/Real Brasileiro
    private String high;        // Maior valor do dia
    private String low;         // Menor valor do dia
    private String varBid;      // Variação
    private String pctChange;   // Variação em %
    private String bid;         // Valor de compra
    private String ask;         // Valor de venda
    private String timestamp;
}
