# api_banco
Projeto de api para um sistema bancário,utilizando a framework Spring Boot com JAVA 11 e banco de dados mySql, com as funcionalidades;

   * Cadastro de uma instituição financeira - Banco
   * Cadastro de uma agência bancária pertencente a uma instituição
   * Cadastro de Clientes juntamente com uma conta bancária
   * Extrato bancário demonstrando a movimentação financeira de uma conta
   * Saques
   * Depósitos
   * Transferências


A aplicação utiliza o padrão OAuth 2.0, que gera um token, por tempo limitado, para acesso aos dados e realização de cadastros.


# Metódos	

* Todos os cadastros retornam menssagens com, status e menssagem de erro; 

{"status":"ok","message":"cadastrado com sucesso"}  
{"status":"erro","message":"menssagem de erro"}  

**Get: http://127.0.0.1:8080/oauth/token**   
Retorna o token a ser utilizado;  

**Parâmetros no header**  
grant_type=password  
username=jorge  
password=1234  


**Get: http://127.0.0.1:8080/api/extrato/{id}**  
Retorna o extrato de uma conta específica;  
{id} = Id da conta ao que o extrato se refere.

**Post: http://127.0.0.1:8080/api/transacao **   
Cria uma nova transação;
Body = Objeto da classe Transacoes;

**Post: http://127.0.0.1:8080/api/agencia** 
Cadastra uma nova agência;
Body = Objeto da classe Agencia;


**Get: http://127.0.0.1:8080/api/agencia/{Id}**   
Retorna uma agência específica;  
{id} = Id da agência a pesquisar;  


**Get: http://127.0.0.1:8080/api/banco/{Id}**   
Retorna um banco específico;
{id} = Id do banco a pesquisar;

**Get: http://127.0.0.1:8080/api/bancos**  
Retorna a lista de bancos cadastrados;  

**Get: http://127.0.0.1:8080/api/contas**  
Retorna a lista de todas as contas cadastradas;

**Get: http://127.0.0.1:8080/api/conta/{id}** 
Retorna os dados de uma conta específica;
{id} = Id da conta a pesquisar;

**Post: http://127.0.0.1:8080/api/conta** 
Cadastro de um novo cliente/conta;
Body = Objeto da classe Conta;
