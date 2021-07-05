algoritmo "Exercicio3"
    var v1, v2: real
    procedimento realizarOperacoesAritmeticas(valor1, valor2: real)
    inicio
        escreval("Adição:", valor1 + valor2)
        escreval("Subtração:", valor1 - valor2)
        escreval("Multiplicação:", valor1 * valor2)
        escreval("Divisão:", valor1 / valor2)
    fimprocedimento
inicio
    escreva("Digite o valor 1: ")
    leia(v1)
    escreva("Digite o valor 2: ")
    leia(v2)
    realizarOperacoesAritmeticas(v1, v2)
fimalgoritmo