algoritmo "Exercicio4"

var a, b: inteiro

   funcao testar(valorA, valorB: inteiro): inteiro
   inicio
      se valorA = 0 entao
         se valorB = 0 entao
            escreva("A = B")
         senao
            escreva("A < B")
         fimse
      senao
         se valorB = 0 entao
            escreva("A > B")
         senao
            valorA <- valorA - 1
            valorB <- valorB - 1
            retorne testar(valorA, valorB)
         fimse
      fimse
   fimfuncao

inicio

   escreva("Digite o valor de A: ")
   leia(a)

   escreva("Digite o valor de B: ")
   leia(b)

   escreva(testar(a, b))

fimalgoritmo
