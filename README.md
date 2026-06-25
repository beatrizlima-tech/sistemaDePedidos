# 🛒 Sistema de Pedidos

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge\&logo=openjdk)
![POO](https://img.shields.io/badge/POO-Programação_Orientada_a_Objetos-blue?style=for-the-badge)
![XML](https://img.shields.io/badge/XML-Exportação-orange?style=for-the-badge)
![TXT](https://img.shields.io/badge/TXT-Arquivos-lightgrey?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-lightgrey?style=for-the-badge)

---

# 📌 Sobre o projeto

O **Sistema de Pedidos** é uma aplicação desenvolvida em **Java** para gerenciamento de pedidos e exportação de dados em diferentes formatos.

O projeto foi criado para consolidar conceitos fundamentais de **Programação Orientada a Objetos**, aplicando interfaces, polimorfismo, enumerações e manipulação de arquivos, utilizando uma arquitetura organizada e de fácil manutenção.

---

# 🚀 Funcionalidades

* Cadastro de pedidos
* Cadastro de produtos
* Associação de múltiplos produtos ao pedido
* Controle de status do pedido
* Exportação em arquivo TXT
* Exportação em arquivo XML
* Tratamento de exceções durante o processamento

---

# 🧱 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* JOptionPane
* Manipulação de Arquivos
* XML
* TXT

---

# 🏗️ Estrutura do Projeto

```text
src/

├── controllers
├── entities
├── enums
├── interfaces
└── repositories
```

---

# 📊 Arquitetura

```text
Usuário
    │
    ▼
Controller
    │
    ▼
Entity
    │
    ▼
Repository (Interface)
   ┌───────────────┐
   ▼               ▼
TXT             XML
```

---

# 📚 Conceitos Aplicados

* Programação Orientada a Objetos
* Encapsulamento
* Polimorfismo
* Interfaces
* Enumerações
* Manipulação de Arquivos
* Separação de Responsabilidades
* Geração de arquivos TXT
* Geração de arquivos XML

---

# ▶️ Como Executar

## Pré-requisitos

* Java JDK 17 ou superior
* IntelliJ IDEA, Eclipse ou VS Code

## 1. Clone o repositório

```bash
git clone https://github.com/beatrizlima-tech/sistemaDePedidos.git
```

## 2. Abra o projeto

Importe o projeto em sua IDE Java.

## 3. Execute a aplicação

Execute a classe principal.

Durante a execução será possível escolher:

* Exportação em TXT
* Exportação em XML

---

# 📁 Arquivos Gerados

Os pedidos podem ser exportados automaticamente para:

* `pedido_UUID.txt`
* `pedido_UUID.xml`

Cada arquivo contém todas as informações do pedido, incluindo produtos, quantidades e status.

---

# 📌 Melhorias Futuras

* Cadastro dinâmico de produtos
* Persistência em banco de dados
* Interface gráfica completa
* Integração com APIs REST
* Exportação em JSON
* Geração de PDF

---

# 👩‍💻 Autora

Desenvolvido por **Beatriz Lima**

🔗 GitHub
https://github.com/beatrizlima-tech

💼 LinkedIn
https://www.linkedin.com/in/beatrizlima-tech
