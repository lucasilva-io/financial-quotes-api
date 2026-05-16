package com.api.finnach.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CotacaoResponse {
    @JsonProperty("USDBRL")
    private Cotacao usdbrl;

    @JsonProperty("EURBRL")
    private Cotacao eurbrl;

    @JsonProperty("BTCBRL")
    private Cotacao btcbrl;
}
