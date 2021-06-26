algoritmo "Exercicio13"

var

   codigoProduto, quantidade: inteiro
   precoUnidade, precoTotal: real

inicio

   escreva("Digite o código do produto: ")
   leia(codigoProduto)

   enquanto (codigoProduto <> 1001) e (codigoProduto <> 1324) e (codigoProduto <> 6548) e (codigoProduto <> 0987) e (codigoProduto <> 7623) faca
      escreva("Código inválido! Tente novamente (1001 | 1324 | 6548 | 0987 | 7623): ")
      leia(codigoProduto)
   fimenquanto

   escreva("Digite a quantidade: ")
   leia(quantidade)

   escolha codigoProduto
      caso 1001
         precoUnidade <- 5.32
      caso 1324
         precoUnidade <- 6.45
      caso 6548
         precoUnidade <- 2.37
      caso 0987
         precoUnidade <- 5.32
      caso 7623
         precoUnidade <- 6.45
   fimescolha

   precoTotal <- quantidade * precoUnidade
   
   escreva("Preço total: ",precoTotal)

fimalgoritmo
