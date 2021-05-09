### Projeto de estudo com Java
![example workflow](https://github.com/httpmurilo/ecommerce-estudos-java/actions/workflows/maven-publish.yml/badge.svg)


A proposta é usar conceitos como API,MVC, Spring boot, Spring jdbc,jaxb, RabbitMQ. 


### Health Check

```
http://localhost:8089/actuator/health
```

Retorno esperado :

```
{"status":"UP"}
```

Fluxo da aplicação : 

Ator Funcionário : 

1. Possui cadastro de usuário.
2. Realiza o CRUD de Categorias.
3. Realiza o CRUD de Produtos.
4. Realiza o CRUD de Usuários
5. Realiza a criação de campanhas de vendas - a fazer.


Ator Cliente : 

1. Possui cadastro de usuario.
2. Quando realiza a primeira compra com o usuário autenticado, se torna um cliente - a fazer.

