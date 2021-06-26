algoritmo "Exercicio12"

var h: real
   sexo: caractere

inicio

   escreva("Digite o sexo (m | f): ")
   leia(sexo)

   escreva("Digite a altura: ")
   leia(h)

   se (sexo = "m") ou (sexo = "M") entao
      escreva("Peso ideal: ",72.7 * h - 58)
   senao
      se (sexo = "f") ou (sexo = "F") entao
         escreva("Peso ideal: ",62.1 * h - 44.7)
      fimse
   fimse

fimalgoritmo
