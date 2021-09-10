# Aplicando o conceito de herança em Java com um sistema de usuários de uma escola
## Requisitos
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=windows)
- Java e Maven instalados

## Licença
Distribuido sob a licença MIT License. Veja `LICENSE` para mais informações.

## Dica - Use o terminal para...
Checar se o Java está instalado:
>java --version

Checar se o Maven está instalado:
>mvn -v 

## Como executar o projeto?
1) Clone o projeto no terminal com o seguinte comando: `git clone https://github.com/FernandaMakiHirose/escola.git`
2) Abra o projeto no IntelliJ IDEA
3) Aceitei o IntelliJ IDEA instalar as dependências e o Maven. Irá aparecer uma opção de aceitar fazer o download.
4) Dentro do arquivo `EscolaApplication.java` digite no terminal: `mvn spring-boot:run`

## Como inicializei o projeto?
- Utilizei o site [Spring Initializr](https://start.spring.io/) para gerar meu projeto
- Project: [X] Maven Project
- Language: [X] Java
- Spring Boot: [X] 2.5.4
- Group: fernandamakihirose
- Artifact: escola
- Name: escola
- Description: Demo project for Spring Boot
- Package name: fernandamakihirose.livros-escola
- Packaging: [X] Jar
- Java: [X] 11 
- Dependencies: Lombok
