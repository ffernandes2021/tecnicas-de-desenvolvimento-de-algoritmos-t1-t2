algoritmo "Exercicio15"
    var i: inteiro
    a, b, c, menor, medio, maior: real
inicio
    escreva("Digite o valor de i (1 | 2 | 3): ")
    leia(i)
    escreva("Digite o valor de a: ")
    leia(a)
    escreva("Digite o valor de b: ")
    leia(b)
    escreva("Digite o valor de c: ")
    leia(c)
    se (a > b) e (a > c) entao
        se b > c entao
            maior <- a
            medio <- b
            menor <- c
        senao
            maior <- a
            medio <- c
            menor <- b
        fimse
    senao
        se (b > a) e (b > c) entao
            se a > c entao
                maior <- b
                medio <- a
                menor <- c
            senao
                maior <- b
                medio <- c
                menor <- a
            fimse
        senao
            se (c > a) e (c > b) entao
                se a > b entao
                    maior <- c
                    medio <- a
                    menor <- b
                senao
                    maior <- c
                    medio <- b
                    menor <- a
                fimse
            fimse
        fimse
    fimse
    escolha i
        caso 1
            escreva("Os números em ordem crescente: ",menor,medio,maior)
        caso 2
            escreva("Os números em ordem decrescente: ",maior,medio,menor)
        caso 3
            escreva("O maior entre os outros dois: ",menor,maior,medio," ou ",medio,maior,menor)
    fimescolha
fimalgoritmo
