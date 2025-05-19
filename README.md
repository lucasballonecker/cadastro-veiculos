
# Cadastro de veículos

Uma API REST simples para cadastrar veículos.Desenvolvido com Java e Spring Boot.




## Variáveis de Ambiente

Para rodar esta aplicação, você precisa de:

Java: JDK 21 ou superior.
Maven: Versão 3.9.9 ou  superior.
MySQL: Versão 8.0.37 ou superior
Git: Para clonar o repositório.


##  Como Configurar o Projeto

1. Clone o Repositório

2. Compile o Projeto

```bash
 mvn clean install
```

3. Execute o Projeto

```bash
mvn spring-boot:run
```

## Documentação da API

#### Cadastrar Veículos

```http
  POST /veiculos
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `proprietario` | `String` | **Obrigatório**. Proprietário do veículo 
| `cpf` | `String` | **Obrigatório**. O cpf do proprietário
| `placa` | `String` | **Obrigatório**. A placa do veículo

