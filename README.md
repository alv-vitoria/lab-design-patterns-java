# Design Patterns com Java Puro — Singleton

Projeto desenvolvido como parte do bootcamp da [DIO](https://www.dio.me/), com foco em Padrões de Projeto (Design Patterns) utilizando Java puro.

---

## Padrão Implementado: Singleton

O **Singleton** é um padrão de projeto criacional que garante que uma classe tenha **apenas uma instância** durante toda a execução do programa, fornecendo um ponto de acesso global a essa instância.

### Quando usar?

- Conexões com banco de dados
- Gerenciadores de configuração
- Sistemas de log
- Caixas de diálogo (em aplicações desktop)

---

## Estrutura do Projeto

```
lab-design-patterns-java/
├── src/
│   ├── banco.java
│   └── main.java
└── README.md
```

---

## Como funciona o código

A classe `Banco` representa uma conta bancária única no sistema. Ela possui:

- Construtor `private` — impede que outras classes criem instâncias diretamente
- Atributo `static instancia` — armazena a única instância da classe
- Método `getInstancia()` — ponto de acesso global; cria a instância apenas se ela ainda não existir

```java
public static Banco getInstancia() {
    if (instancia == null) {
        instancia = new Banco();
    }
    return instancia;
}
```

---

## Como executar

### Pré-requisitos

- Java 21+ instalado
- Terminal (Bash, PowerShell, etc.)

### Passos

```bash
# Clone o repositório
git clone https://github.com/alv-vitoria/lab-design-patterns-java.git

# Entre na pasta do projeto
cd lab-design-patterns-java/src

# Compile os arquivos
javac Banco.java Main.java

# Execute
java Main
```

### Saída esperada

```
=== Padrão Singleton - Banco Digital ===

Banco: Banco Digital | Saldo: R$1000.0
Após depósito de R$500:
Banco: Banco Digital | Saldo: R$1500.0
Após saque de R$200 via banco2:
Banco: Banco Digital | Saldo: R$1300.0

banco1 e banco2 são a mesma instância? true
```

---

## Conceitos aplicados

| Conceito | Descrição |
|---|---|
| Singleton | Garante uma única instância da classe |
| Encapsulamento | Atributos privados acessados por métodos |
| Modificador `static` | Permite acesso sem criar nova instância |

---

<div align="center">
  <img src="https://github.com/user-attachments/assets/134232cd-e838-4145-a3a5-1567dc5f176a" alt="image" />
</div>

### Projeto elaborado durante o bootcamp Santander 2026 - AI Java Back-end   

## Autora
Vitória Alvares  
### Contatos  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/vitória-alvares/)  [![GitHub](https://img.shields.io/badge/GitHub-0d1117?style=for-the-badge&logo=github&logoColor=58a6ff&labelColor=0d1117)](https://github.com/alv-vitoria)   [![E-mail](https://img.shields.io/badge/-Email-2d1b4e?style=for-the-badge&logo=microsoft-outlook&logoColor=c084fc)](mailto:Alvares26Sa@proton.me)   
