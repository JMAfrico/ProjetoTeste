#language: pt

Funcionalidade: Cotacao
  Como usuario comum do site, quero fazer uma cotacao de um veiculo

  @cotacao_com_sucesso
  Cenario: Cotacao com sucesso
    Dado que estou no site de cotacao
    E que estou na guia Vehicle Data
    Quando seleciono a marca do veiculo "Nissan"
    E seleciono a modelo do veiculo "Moped"
    E digito a cilindrada do veiculo "125" ccm
    E digito a forca do motor do veiculo "500" KW
    E seleciono a data de fabricacao do veiculo "01/08/2000"
    E seleciono o numero de assentos do veiculo "2"
    E seleciono a opcao de motorista conduz pelo lado direito
    E seleciono o numero de assentos do lado do motorista "1"
    E seleciono o tipo de combustivel do veiculo "Petrol"
    E digito a carga util do veiculo "50"
    E digito o peso do veiculo "4000"
    E digito o preco de tabela do veiculo "25000"
    E digito o numero da placa do veiculo "HKF2258C"
    E digito a quilometragem do veiculo "75000"
    E clico em next
    

