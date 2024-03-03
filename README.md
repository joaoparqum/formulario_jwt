## BACK-END Formulário com Spring Security

<p>Elaborei uma prática em um projeto já existente que eu fiz com meu amigo Dev FrontEnd Everton, para implementar o Spring Security e JWT Token no back-end.</p>

<h2>Como acessar</h2>

<p>Faça a requisição POST com o link:</p>

```
http://localhost:8080/auth/register
```
<p>Passe o login, password e a role</p>

```
{
    "login": "seulogin",
    "password": "suasenha",
    "role": "ADMIN"
}
```
<p>Faça a requisição POST para fazer o login com o link:</p>

```
http://localhost:8080/auth/login
```

<p>Passe o login, password e faça o request</p>

```
{
    "login": "seulogin",
    "password": "suasenha",
}
```

<p>Ele irá gerar um token, pegue esse token use-o como tipo Bearer, faça em qualquer requisição da aplicaão e você terá acesso a API</p>
