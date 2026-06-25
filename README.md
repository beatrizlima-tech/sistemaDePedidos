# 🛒 Sistema de Pedidos

Projeto desenvolvido em Java com foco na aplicação de conceitos fundamentais de Programação Orientada a Objetos (POO), utilizando interfaces, polimorfismo e manipulação de arquivos para gerenciamento e exportação de pedidos.

## 🚀 Sobre o Projeto

A aplicação permite criar pedidos contendo produtos e exportar as informações em diferentes formatos (TXT ou XML), demonstrando a utilização de boas práticas de desenvolvimento orientado a objetos.

O projeto foi desenvolvido com o objetivo de fortalecer conhecimentos em arquitetura orientada a objetos e padrões de abstração frequentemente utilizados em aplicações corporativas.

## ✨ Funcionalidades

* Cadastro de pedidos
* Cadastro de produtos
* Associação de múltiplos produtos ao pedido
* Controle de status do pedido
* Exportação dos dados em formato TXT
* Exportação dos dados em formato XML
* Tratamento de exceções durante o processamento

## 🛠️ Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* JOptionPane
* Manipulação de Arquivos
* XML
* TXT

## 🏗️ Estrutura do Projeto

```text
src/
├── controllers
├── entities
├── enums
├── interfaces
└── repositories
```

## 🧠 Conceitos Aplicados

### Encapsulamento

Utilização de atributos privados com métodos getters e setters para controle dos dados.

### Enumerações

Implementação do enum `StatusPedido` para representar os estados do pedido.

### Interfaces

Definição do contrato de exportação através da interface `PedidoRepository`.

### Polimorfismo

Implementação de diferentes estratégias de exportação utilizando:

* PedidoRepositoryTXT
* PedidoRepositoryXML

### Manipulação de Arquivos

Geração automática de arquivos contendo os dados do pedido de acordo com o formato escolhido.

## ▶️ Como Executar

### Pré-requisitos

* Java JDK 17 ou superior
* IDE Java (Eclipse, IntelliJ IDEA ou VS Code)

### Clonar o Projeto

```bash
git clone https://github.com/beatrizlima-tech/sistemaDePedidos.git
```

### Executar

Abra o projeto em sua IDE Java preferida e execute a classe principal.

Durante a execução, informe os dados solicitados pelo sistema e escolha o formato de exportação desejado.

## 📚 Objetivo

Este projeto foi desenvolvido para praticar conceitos essenciais utilizados no desenvolvimento de software com Java, especialmente Programação Orientada a Objetos, abstração, polimorfismo, interfaces e persistência de dados em arquivos.

## 👩‍💻 Autora

Beatriz Lima de Oliveira

GitHub:
https://github.com/beatrizlima-tech
