#language:pt
@demo
Funcionalidade: Testar o formulario de registro
  Preenchimento do formulario

  Cenario: Preencher o formulario
    Dado que estou na pagina Register com o titulo "Automation Demo Site"
    Quando o campo firstName esta preenchido com "Hedan"
    E o campo lastName esta preenchido com "Costa"
    Quando os campos do formulario estao preenchidos com dados validos