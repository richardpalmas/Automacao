#language: pt
#encoding: UTF-8

@login
Funcionalidade: Login

@loginInvalido
Cenario: Realizar login invalido
Quando eu informar o usuario "user1"
E informar a senha "admin123"
E acionar o botao login
Entao o sistema apresenta a mensagem "Invalid credentials"

@loginSucesso
Cenario: Realizar login sucesso
Quando eu informar o usuario "admin"
E informar a senha "admin123"
E acionar o botao login
Entao o sistema apresenta no campo do usuario logado "Welcome Admin"
E o sistema apresenta o logo do sino 

@usuarioObrigatorio
Cenario: Campo username obrigatorio
Quando eu informar o usuario ""
E informar a senha ""
E acionar o botao login
Entao o sistema apresenta a mensagem "Username cannot be empty"

@senhaObrigatorio
Cenario: Campo senha obrigatorio
Quando eu informar o usuario "admin"
E informar a senha ""
E acionar o botao login
Entao o sistema apresenta a mensagem "Password cannot be empty"

