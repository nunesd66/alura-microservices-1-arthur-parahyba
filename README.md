# Microservices com Spring Cloud: Registry, Config Server e Distributed Tracing

by Arthur Parahyba

## Sobre

> Curso oferecido pela plataforma [Alura](https://www.alura.com.br/) com foco na introdução de microserviços em java.

[Link do curso](https://cursos.alura.com.br/course/microservices-spring-cloud-service-registry-config-server)

## Tecnologias e versões utilizadas:

- Java 8
- Spring Boot 2.1.5.RELEASE
- Spring Cloud Greenwich.SR1
- MariaDB 10.3.15.0
- MySQL 8.0.33

## Dependências e afins:

- RestTemplate: inicialmente foi usado para consumir endpoints HTTP e depois substituído pelo OpenFeign no decorrer do curso;
- EurekaServer: funciona como um ponto central para chamadas de outros serviços na arquitetura de microserviços;
- ConfigServer: funciona como um ponto central de configurações para outros serviços na arquitetura de microserviços;
- LoadBalanced: utilizado para distribuir as requisições entre diferentes instâncias do mesmo seriço, afim de equilibrar o volume com o qual cada serviço recebe requisições;
- OpenFeign: usado para uma API consumir serviços externos no protocolo HTTP. Em uma arquitetura de microserviços, é utilizado para comunicação entre os serviços também;
- Distributed Tracing: termo usado para observar solicitações de serviços em sistemas distribuídos, colentando informações proveniente de solicitações entre serviços;
- Papertrail: sistema online de gerenciamento de logs, contendo uma versão gratuida e outra paga;
- Spring Sleuth: adiciona IDs nos logs com base em cada requisição, afim de filtrar os logs por determinada requisição.

## Observações

> Não repliquei o módulo de Distributed Tracing, pois esse não era meu objetivo com o curso, apesar de assistir, ler e entender seu funcionamento.

## Considerações finais

> Esse README foi construído para fins de referência pessoal e consolidação dos conhecimentos adquiridos no curso.
