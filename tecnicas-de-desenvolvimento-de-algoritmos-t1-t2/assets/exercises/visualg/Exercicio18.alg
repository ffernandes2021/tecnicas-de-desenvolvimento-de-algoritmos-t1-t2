algoritmo "Exercicio18"

var

   vet: vetor [1..150] de real
   peso: real
   i, posicao: inteiro

inicio

   para i de 1 ate 150 faca
      escreva("Digite o peso: ")
      leia(peso)
      vet[i] <- peso
   fimpara

   para i de 1 ate 150 faca
      se vet[i] < peso entao
         peso <- vet[i]
         posicao <- i
      fimse
   fimpara

   escreva("Na posição ",posicao," está o menor peso, que é ",peso)

fimalgoritmo
