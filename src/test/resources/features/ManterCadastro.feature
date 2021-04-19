#language: pt
#encoding: UTF-8

@manterCadastro
Funcionalidade: Login

@editarUsuario
Cenario: editar Usuario
Quando acionar a aba admin
E clicar no usuario "Antonio"
E acionar o botao editSalvar
E Informar no campo username "Marcelo"
E acionar o botao editSalvar
Entao o sistema cadastra o usuario "Marcelo"
