algoritmo "Exercicio3"

var

   vet: vetor [1..100] de inteiro
   i, numero, quantidade, cont: inteiro

inicio

   cont <- 0
   numero <- 1

   enquanto cont < 100 faca

      quantidade <- 0

      para i de 1 ate numero faca

         se numero % i = 0 entao
            quantidade <- quantidade + 1
         fimse

      fimpara

      se quantidade = 2 entao
         cont <- cont + 1
         vet[cont] <- numero
      fimse
      numero <- numero + 1

   fimenquanto

   para i de 1 ate 100 faca
      escreval(vet[i])
   fimpara
   
fimalgoritmo
