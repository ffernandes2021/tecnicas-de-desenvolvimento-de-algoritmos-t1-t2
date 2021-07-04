algoritmo "Exercicio11"
    var idade: inteiro
    categoria: caractere
inicio
    escreva("Digite a idade: ")
    leia(idade)
    se (idade >= 5) e (idade <= 7) entao
        categoria <- "infantil A"
    senao
        se (idade >= 8) e (idade <= 10) entao
            categoria <- "infantil B"
        senao
            se (idade >= 11) e (idade <= 13) entao
                categoria <- "juvenil A"
            senao
                se (idade >= 14) e (idade <= 17) entao
                    categoria <- "juvenil B"
                senao
                    se (idade >= 18) entao
                      categoria <- "adulto"
                    senao
                        categoria <- "não definida"
                    fimse
                fimse
            fimse
        fimse
    fimse
    escreva("Categoria: ",categoria)
fimalgoritmo
