# APIrest-CRUD Spring Boot
API feita em java, com as quatro principais requisições HTTP - Create Read Update Delete


- A API Mostra uma lista de clientes cadastrados ao utilizar a requisição GET no endpoint "/Clientes"
- A API Cadastra uma entidade cliente ao utilizar uma requisição POST no endpoint "/Clientes", neste caso passamos um JSON com os Atributos do Cliente
- A API Filtra um cliente por ID no repositório ao utilizar a requisição GET no endpoint "/Clientes/{id}"
- A API Deleta um cliente por ID no repositório ao utilizar a requisição DELETE no endpoint "/Clientes/{id}"

#Dependências Utilizadas
- H2 Database
- Spring Data JPA
- Lombok
- Spring WEB
- Spring Boot DevTools
