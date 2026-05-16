# Financial Quotes API

API REST simples desenvolvida com Java e Spring Boot para consulta de cotações financeiras em tempo real.

Atualmente a API fornece:

- Dólar para Real (USD/BRL)
- Euro para Real (EUR/BRL)
- Bitcoin para Real (BTC/BRL)

## Tecnologias utilizadas

- Java
- Spring Boot
- Maven
- Lombok
- RestTemplate

## Endpoints

### Dólar

```http
GET /cotacao/dolar
```

### Euro

```http
GET /cotacao/euro
```

### Bitcoin

```http
GET /cotacao/bitcoin
```

## Exemplo de resposta

```json
{
  "code": "USD",
  "codein": "BRL",
  "name": "Dólar Americano/Real Brasileiro",
  "high": "5.67",
  "low": "5.61",
  "bid": "5.65",
  "ask": "5.66"
}
```

## Como executar

```bash
git clone https://github.com/lucasilva-io/financial-quotes-api.git
cd financial-quotes-api
mvn spring-boot:run
```

## Fonte dos dados

Dados obtidos através da API AwesomeAPI.

## Objetivo

Projeto criado para prática de desenvolvimento de APIs REST com Spring Boot e consumo de APIs externas.
