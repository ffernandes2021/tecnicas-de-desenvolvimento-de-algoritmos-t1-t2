algoritmo "Exercicio3"
    var v1, v2: real
    procedimento realizarOperacoesAritmeticas(valor1, valor2: real)
    inicio
        escreval("Adi��o:", valor1 + valor2)
        escreval("Subtra��o:", valor1 - valor2)
        escreval("Multiplica��o:", valor1 * valor2)
        escreval("Divis�o:", valor1 / valor2)
    fimprocedimento
inicio
    escreva("Digite o valor 1: ")
    leia(v1)
    escreva("Digite o valor 2: ")
    leia(v2)
    realizarOperacoesAritmeticas(v1, v2)
fimalgoritmo