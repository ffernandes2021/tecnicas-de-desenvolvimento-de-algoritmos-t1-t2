algoritmo "Exercicio20"

var anoNascimento, anoAtual, idadeAno: inteiro

inicio

   escreva("Digite o ano de nascimento: ")
   leia(anoNascimento)
   escreva("Digite o ano atual: ")
   leia(anoAtual)

   enquanto anoAtual <= anoNascimento faca
      escreva("O ano atual não pode ser inferior ou igual ao ano de nascimento! Tente novamente: ")
      leia(anoAtual)
   fimenquanto

   idadeAno <- anoAtual - anoNascimento
   escreval("Idade em anos: ", idadeAno)
   escreval("Idade em meses: ", idadeAno * 12)
   escreval("Idade em semanas: ", idadeAno * 52)
   escreval("Idade em dias: ", idadeAno * 365)

fimalgoritmo
