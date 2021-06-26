algoritmo "Exercicio5"

var numero: inteiro

inicio

   escreva("Digite um numero: ")
   leia(numero)
   
   se numero >= 0 entao
      se numero % 2 = 0 entao
         escreva("positivo e par")
      senao
         escreva("positivo e impar")
      fimse
   senao
      se numero % 2 = 0 entao
         escreva("negativo e par")
      senao
         escreva("negativo e impar")
      fimse
   fimse

fimalgoritmo
