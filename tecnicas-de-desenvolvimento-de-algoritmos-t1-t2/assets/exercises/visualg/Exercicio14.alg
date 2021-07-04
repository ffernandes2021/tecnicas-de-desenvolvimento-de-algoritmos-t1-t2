algoritmo "Exercicio14"
    var salario, novoSalario, diferenca: real
    codigoCargo: inteiro
inicio
    escreva("Digite o salário: ")
    leia(salario)
    escreva("Digite o código do cargo: ")
    leia(codigoCargo)
    escolha codigoCargo
        caso 101
            novoSalario <- salario + salario * 10 / 100
        caso 102
            novoSalario <- salario + salario * 20 / 100
        caso 103
            novoSalario <- salario + salario * 30 / 100
        outrocaso
            novoSalario <- salario + salario * 40 / 100
    fimescolha
    diferenca <- novoSalario - salario
    escreval("Salário antigo: ",salario)
    escreval("Novo salário: ",novoSalario)
    escreval("Diferença: ",diferenca)
fimalgoritmo
