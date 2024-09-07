# microssevico-estoque-preco

Este projeto implementa um microserviço responsável por receber requisições e gerar mensagens para outros microserviços. Ele usa RabbitMQ como middleware para comunicação assíncrona entre os serviços. O sistema é composto por um produtor e dois consumidores, sendo um consumidor em Java Spring Boot e outro em Node.js.

## Arquitetura

Produtor: Um microserviço desenvolvido em Java com Spring Boot que publica mensagens em uma fila do RabbitMQ.

Consumidor Java: Microserviço desenvolvido em Java com Spring Boot que consome mensagens da fila.

Consumidor Node.js: Um segundo microserviço, desenvolvido em Node.js, também responsável por consumir mensagens da mesma fila.

## Diagrrama de arquitetura
