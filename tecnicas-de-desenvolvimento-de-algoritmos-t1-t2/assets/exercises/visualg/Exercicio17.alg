algoritmo "Exercicio17"

var salarioInicial, salarioAumento, salarioFinal: real

inicio

   escreva("Digite o salário: ")
   leia(salarioInicial)
   
   salarioAumento <- salarioInicial + salarioInicial * 0.15
   
   salarioFinal <- salarioAumento - salarioAumento * 0.08
   
   escreval("Salário inicial: ",salarioInicial)
   escreval("Salário com aumento: ",salarioAumento)
   escreval("Salário final: ",salarioFinal)

fimalgoritmo
