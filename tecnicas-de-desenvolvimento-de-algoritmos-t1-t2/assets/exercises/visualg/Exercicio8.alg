algoritmo "Exercicio8"
    var c1, c2, c3, qtdeVotantes, i, voto: inteiro
inicio
    escreva("Digite o total de votantes: ")
    leia(qtdeVotantes)
    para i de 1 ate qtdeVotantes faca
        escreva("Digite seu voto (1 | 2 | 3): ")
        leia(voto)
        enquanto (voto <> 1) e (voto <> 2) e (voto <> 3) faca
            escreva("Candidato inexistente! Tente novamente (1 | 2 | 3): ")
            leia(voto)
        fimenquanto
        se voto = 1 entao
            c1 <- c1 + 1
        senao
            se voto = 2 entao
                c2 <- c2 + 1
            senao
                c3 <- c3 + 1                
            fimse
        fimse
    fimpara
    escreval("Votos C1: ",c1)
    escreval("Votos C2: ",c2)
    escreval("Votos C3: ",c3)
fimalgoritmo
