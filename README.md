# PesquisaCEP

Este projeto foi desenvolvido como parte do meu aprendizado em manipulação de APIs e uso do Maven no Java. O objetivo principal é interagir com a API do ViaCEP para consultar informações sobre CEPs fornecidos pelo usuário. O programa permite ao usuário pesquisar informações de um CEP específico e perguntar se ele gostaria de realizar outra pesquisa.

## Funcionalidades

- Consulta informações de um CEP utilizando a API do ViaCEP.
- Exibe as informações detalhadas do CEP, como logradouro, bairro, cidade, estado, etc.
- Permite que o usuário realize múltiplas consultas consecutivas.

## Pré-requisitos

- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven 3.6+](https://maven.apache.org/download.cgi)

## Configuração do Projeto

1. **Clone o repositório**

   ```
   git clone https://github.com/MikaelDv/PesquisaCEP-Java.git
   cd PesquisaCEP-Java
   ```
2. **Instale as dependências**

   Navegue até o diretório do projeto e execute o seguinte comando para baixar todas as dependências necessárias:

   ```
   mvn clean install
   ```
### Como Executar
1. **Compilar o projeto**

   ```
   mvn compile
   ```
3. **Executar o programa**

   Para executar o programa, você precisa usar o nome completo da classe principal. O nome completo da classe inclui o pacote e o nome da classe. Supondo que sua classe principal seja Main e esteja no pacote com.exemplo.viacep, o comando seria:
   ```
   mvn exec:java -Dexec.mainClass="com.apitest.Main"
   ```

## Uso
Ao executar o programa, o usuário será solicitado a inserir um CEP para pesquisa. Em seguida, as informações do CEP serão exibidas. O usuário será então perguntado se deseja realizar outra pesquisa. Este processo se repetirá até que o usuário decida sair.

**Exemplo de execução:**
```
*** CEP SEARCH ***

Digite o CEP: 01001-000
CEP: 01001-000
Logradouro: Praça da Sé
Bairro: Sé
UF: SP
DDD: 11

Deseja pesquisar por outro CEP? (Y/n)
y
*** CEP SEARCH ***

Digite o CEP: 30130-010
CEP: 30130-010
Logradouro: Praça Sete de Setembro
Bairro: Centro
UF: MG
DDD: 31

Deseja pesquisar por outro CEP? (Y/n)
n

Até mais!
```

## Estrutura do Projeto
- **src/main/java**: Contém o código-fonte do projeto.
  - **org/apitest**: Pacote principal do projeto.
  - **Main.java**: Classe principal que contém a lógica de execução do programa.
  - **ApiServico.java**: Classe que interage com a API do ViaCEP.
  - **EnderecoDto.java**: Classe que representa as informações de um CEP.
    
## Dependências
O projeto utiliza as seguintes dependências Maven:

- **com.fasterxml.jackson.core:jackson-databind:2.16.2**: Biblioteca para trabalhar com JSON.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

##

Feito por: [Mikael Sanches](https://www.github.com/MikaelDv) • [LinkedIn](https://www.linkedin.com/in/enzo-mikael-sanches-baptista-paes-fontes-531302297/)
##

## Recursos Adicionais
- [Documentação da API ViaCEP](https://viacep.com.br/)
- [Documentação do Maven](https://maven.apache.org/guides/index.html)
  
Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato. Boa codificação!
